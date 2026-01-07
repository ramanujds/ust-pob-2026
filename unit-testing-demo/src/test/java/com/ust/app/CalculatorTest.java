package com.ust.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd(){
        int a = 10;
        int b = 20;
        assertEquals(30,calc.add(a,b));
    }

}