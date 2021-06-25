package com.giacom.java2021.records;

import org.junit.Ignore;
import org.junit.Test;

public class AuthorTest {

    @Test
    @Ignore
    public void testAgeLess18() {
        var author = new Author("Sandro", 15);
    }

    @Test
    public void testAgeAfter8() {
        var author = new Author("Sandro", 18);
        System.out.println(author);
    }

}
