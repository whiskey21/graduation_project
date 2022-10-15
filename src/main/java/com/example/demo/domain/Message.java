package com.example.demo.domain;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String age;
    private String gender;
    private String timestamp;

    public Message(String id, String age, String gender, String timestamp) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.timestamp = timestamp;
    }

    public Message() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + id + '\'' +
                ", content='" + age + '\'' +
                ", room='" + gender + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}