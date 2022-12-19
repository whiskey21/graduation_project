package com.example.demo.controller;

import com.example.demo.consumer.ConsumerRepositoryImpl;
import com.example.demo.domain.Consumer;
import com.example.demo.dto.ConsumerDto;
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
    ConsumerRepositoryImpl consumerRepositoryimpl;

    @PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
    public void register(@RequestBody ConsumerDto consumerDto) {
        log.info("Consumer INFO " + consumerDto.getId() + " " + consumerDto.getAge());
        Consumer consumer1 = new Consumer();
        consumer1.setId(consumerDto.getId());
        consumer1.setGender(consumerDto.getGender());
        consumer1.setAge(consumerDto.getAge());

        consumerRepositoryimpl.putConsumerInfo(consumer1);

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
