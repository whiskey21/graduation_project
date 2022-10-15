package com.example.demo.controller;

import com.example.demo.consumer.MessageListener;
import com.example.demo.domain.Consumer;
import com.example.demo.domain.Subscription;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 2022-09-01 00:00 Consumer Controller로 Consume 설정하기 위해 만듬.
// 이 부분도 Consume하는 일부분으로 떨어져나갈 수 도 있음. 하나의 micro service로
@Slf4j
@RestController
@RequestMapping(value = "/api/consume")
public class ConsumerController {

    @Autowired
    private MessageListener messageListener;

    @PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
    public void register(@RequestBody Consumer consumer, Subscription subscription) {
        log.info("Consumer INFO"+consumer.getId() + " Subscription INFO" + subscription.toString());

        // register 요청시 Listen 하는 로직 들어와야함. 현재는 바로 컴포넌트에서 listen


    }


//    @Autowired
//    private KafkaTemplate<String, Message> kafkaTemplate;
//
//    @PostMapping(value = "/consume", consumes = "application/json", produces = "application/json")
//    public void sendMessage(@RequestBody Message message) {
//        message.setTimestamp(LocalDateTime.now().toString());
//        try {
//            //Sending the message to kafka topic queue
//            kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC, message).get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
