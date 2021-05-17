package com.giacom.java2021.records;

import java.time.LocalDate;

import org.junit.Test;

public class PersonTest {

    @Test
    public void personTest() {
        var person = new Person("Sandro", "112121212",
                LocalDate.of(1978, 10, 26));
        System.out.println(person);
    }
}
