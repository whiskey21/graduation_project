package com.example.demo.consumer;

import com.example.demo.constant.HashMapConstants;
import com.example.demo.domain.Consumer;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import java.util.*;


@Slf4j
@Component
public class ConsumerRepositoryImpl {

    HashMap<Long, Consumer> map = new HashMap<>();
    public void printMap(){
        for (Long key : map.keySet()) {
            System.out.println(map.get(key).getAge());
        }
    }

    public void putConsumerInfo(Consumer consumer) {

        map.put(consumer.getId(), consumer);
    }

    public List<Consumer> getConsumerInfo(String age) {

        List<Consumer> consumersList = new ArrayList<>();

        for (Long key : map.keySet()) {
            String conAge = map.get(key).getAge();
            if (Objects.equals(conAge, age)) {
                consumersList.add(map.get(key));
            }
        }

        return consumersList;
        }
    }
