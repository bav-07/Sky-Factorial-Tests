package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void reverseFactorialCalculationTest0() {
        assertEquals(0, Factorial.reverseFactorialCalculation(0));
    }

    @Test
    public void reverseFactorialCalculationTest1() {
        assertEquals(1, Factorial.reverseFactorialCalculation(1));
    }

    @Test
    public void reverseFactorialCalculationTest120() {
        assertEquals(5, Factorial.reverseFactorialCalculation(120));
    }

    @Test
    public void reverseFactorialCalculationTest150() {
        assertEquals(0, Factorial.reverseFactorialCalculation(150));
    }

    @Test
    public void reverseFactorialCalculationTest3628800() {
        assertEquals(10, Factorial.reverseFactorialCalculation(3628800));
    }

    @Test
    public void reverseFactorialCalculationTest479001600() {
        assertEquals(12, Factorial.reverseFactorialCalculation(479001600));
    }

    @Test
    public void reverseFactorialCalculationTest6() {
        assertEquals(3, Factorial.reverseFactorialCalculation(6));
    }

    @Test
        public void reverseFactorialCalculationTest18() {
        assertEquals(0, Factorial.reverseFactorialCalculation(18));
    }

    @Test
    public void reverseFactorialCalculationTestNegative120() {
        assertEquals(0, Factorial.reverseFactorialCalculation(-120));
    }

    @Test
    public void reverseFactorialTest0() {
        assertEquals("NONE", Factorial.reverseFactorial(0));
    }

    @Test
    public void reverseFactorialTest1() {
        assertEquals("1 = 1!", Factorial.reverseFactorial(1));
    }

    @Test
    public void reverseFactorialTest120() {
        assertEquals("120 = 5!", Factorial.reverseFactorial(120));
    }

    @Test
    public void reverseFactorialTest150() {
        assertEquals("NONE", Factorial.reverseFactorial(150));
    }

    @Test
    public void reverseFactorialTest3628800() {
        assertEquals("3628800 = 10!", Factorial.reverseFactorial(3628800));
    }

    @Test
    public void reverseFactorialTest479001600() {
        assertEquals("479001600 = 12!", Factorial.reverseFactorial(479001600));
    }

    @Test
    public void reverseFactorialTest6() {
        assertEquals("6 = 3!", Factorial.reverseFactorial(6));
    }

    @Test
    public void reverseFactorialTest18() {
        assertEquals("NONE", Factorial.reverseFactorial(18));
    }

    @Test
    public void reverseFactorialTestNegative120() {
        assertEquals("NONE", Factorial.reverseFactorial(-120));
    }

}
