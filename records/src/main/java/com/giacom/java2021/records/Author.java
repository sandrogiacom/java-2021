package com.giacom.java2021.records;

public record Author(String name, int age) {

    public Author {
        if (age < 18){
            throw new IllegalArgumentException("Age is less than 18!");
        }
    }
}
