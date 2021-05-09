package com.giacom.java2021.records;

import java.time.LocalDate;

public class RecordTest {
    public static void main(String[] args) {
        Person person = new Person("Sandro", "23222323",
                LocalDate.of(1978, 10, 26));
        System.out.println(person);
    }
}
