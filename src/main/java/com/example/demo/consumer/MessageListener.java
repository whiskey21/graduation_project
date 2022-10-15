package com.example.demo.consumer;

import com.example.demo.constant.KafkaConstants;
import com.example.demo.domain.Message;
import com.example.demo.domain.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

    Subscription subscription = new Subscription("1", "male", "20");

    @Autowired
    SimpMessagingTemplate template;

    @Autowired
    ConsumerServiceImpl consumerService;

    // listen으로는 message만 받고 밖에서 처리
    @KafkaListener(
            topics = KafkaConstants.KAFKA_TOPIC,
            groupId = KafkaConstants.GROUP_ID,
            containerFactory = KafkaConstants.KAFKA_CONTAINER
    )
    public void listen(Message message) {
        // given
        LOGGER.info("Consume data: " + message.toString());

        // 넘겨
        consumerService.getFilter(message);
//        if (filtered != null) {
//            System.out.println("sending via kafka listener..");
//            template.convertAndSend("/topic/group", message);
//        }


    }


}