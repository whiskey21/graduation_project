package com.example.demo.consumer;

import com.example.demo.domain.Consumer;
import com.example.demo.domain.Message;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ConsumerServiceImpl {

    //레포지토리
    @Autowired
    ConsumerRepositoryImpl consumerRepository;

    public void getFilter(Message message) {

        String age = message.getAge();
//        consumerRepository.printMap();
        List<Consumer> consumerList = consumerRepository.getConsumerInfo(age);


        if (consumerList != null) {
            for (int i = 0; i < consumerList.size(); i++) {
                // send logic
                log.info("Consumer INFO " + consumerList.get(i).getId());
            }
        }
        }

}
