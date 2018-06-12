package com.moraes.jacoco.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator1Test {

    @Test
    public void should_plus_on_integer() {
        assertEquals(4, new Calculator1().plus(2, 2));
    }

    @Test
    public void should_plus_on_long() {
        assertEquals(4, new Calculator1().plus(2L, 2));
    }

}