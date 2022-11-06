package com.example.demo.domain;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Consumer {
    private Long id;
    private String gender;
    private String age;

    public Consumer(Long id, String gender, String age) {
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
