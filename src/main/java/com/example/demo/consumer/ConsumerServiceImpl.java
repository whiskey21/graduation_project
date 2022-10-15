package com.example.demo.consumer;

import com.example.demo.domain.Message;
import com.example.demo.domain.Subscription;
import org.springframework.stereotype.Component;

import java.util.Objects;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ConsumerServiceImpl {


    public void getFilter(Message message) {

        if (Objects.equals(message.getAge(), subscription.getAge())) {
            log.info("Listen - "+ "Message Age - " + message.getAge() + " Subsciption Age -" + subscription.getAge());

        } else {

        }
    }
}
