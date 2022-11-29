package com.java.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Attempt1 {
    @Test
    public void FirstTest() {
        Person test = new Person();
        assertEquals("Hello World",test.helloWorld());
    }
}
