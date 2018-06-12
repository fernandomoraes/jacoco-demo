package com.moraes.jacoco.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void should_sum_two_integers() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    public void should_multiple_two_integers() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.multiple(3, 3));
    }

}
