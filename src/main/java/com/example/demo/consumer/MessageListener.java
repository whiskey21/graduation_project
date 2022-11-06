package com.example.demo.consumer;

import com.example.demo.constant.KafkaConstants;
import com.example.demo.domain.Consumer;
import com.example.demo.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

    Consumer consumer = new Consumer(0L, "default", "default");


    @Autowired
    ConsumerServiceImpl consumerService;

    @Autowired
    ConsumerRepositoryImpl consumerRepository;


    // listen으로는 message만 받고 밖에서 처리
    @KafkaListener(
            topics = KafkaConstants.KAFKA_TOPIC,
            groupId = KafkaConstants.GROUP_ID,
            containerFactory = KafkaConstants.KAFKA_CONTAINER
    )
    public void listen(Message message) {
        // given
//        LOGGER.info("Consume data: " + message.toString());
//        LOGGER.info("Consumer info" + consumer);
        // 넘겨
//        consumerRepository.printMap();
        consumerService.getFilter(message);
//        if (filtered != null) {
//            System.out.println("sending via kafka listener..");
//            template.convertAndSend("/topic/group", message);
//        }


    }


}