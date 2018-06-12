package com.moraes.jacoco.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void deve_somar_dois_inteiros() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.soma(2, 2));
    }

}
