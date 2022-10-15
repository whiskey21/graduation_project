package com.example.demo.consumer;
import com.example.demo.domain.Message;
import com.example.demo.domain.Subscription;

public interface ConsumerService {
    void getFilter(Message message, Subscription subscription);

}
