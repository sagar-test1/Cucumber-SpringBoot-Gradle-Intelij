package com.example.demo2.model;

import org.springframework.stereotype.Component;

@Component
public class MyModel {

    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
