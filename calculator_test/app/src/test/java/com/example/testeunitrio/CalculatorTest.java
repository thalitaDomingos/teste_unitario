package com.example.testeunitrio;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSub() {
        int result = calculator.sub(2, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMul() {
        int result = calculator.mul(2, 3);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testDiv() {
        int result = calculator.div(2, 2);
        Assert.assertEquals(1, result);
    }

    // __________________________________________ // ________________________________________

    @Test
    public void testAdd_() {
        int result = calculator.add(2, 3);
        Assert.assertNotEquals(6, result);
    }

    @Test
    public void testSub_() {
        int result = calculator.sub(2, 3);
        Assert.assertNotEquals(1, result);
    }

    @Test
    public void testMul_() {
        int result = calculator.mul(2, 3);
        Assert.assertNotEquals(8, result);
    }

    @Test
    public void testDiv_() {
        int result = calculator.div(2, 2);
        Assert.assertNotEquals(-1, result);
    }
}