package com.example.demo.consumer;
import com.example.demo.domain.Message;

public interface ConsumerService {
    void getFilter(Message message);

}
