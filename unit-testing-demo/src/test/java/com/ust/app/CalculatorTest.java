package com.ust.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp(){
       calc = new Calculator();
    }

    @AfterEach
    void tearDown(){
        calc = null;
    }

    @Test
    void testAdd(){
        assertEquals(30,calc.add(10,20));
        assertEquals(0,calc.add(-10,10));
        assertEquals(-5,calc.add(10,-15));

    }

    @Test
    void testDivide(){
        assertEquals(5,calc.divide(10,2));
        assertThrows(ArithmeticException.class,()->calc.divide(10,0));
    }

}