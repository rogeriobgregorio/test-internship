package com.rogeriogregorio.fibonacci_api.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciServiceImplTest {

    @Test
    public void testIsFibonacci() {
        // Arrange
        FibonacciServiceImpl fibonacciService = new FibonacciServiceImpl();

        //Act and Asserts
        // Testes com números que devem estar na sequência de Fibonacci
        assertTrue(fibonacciService.calculateFibonacci(0));
        assertTrue(fibonacciService.calculateFibonacci(1));
        assertTrue(fibonacciService.calculateFibonacci(2));
        assertTrue(fibonacciService.calculateFibonacci(3));
        assertTrue(fibonacciService.calculateFibonacci(5));
        assertTrue(fibonacciService.calculateFibonacci(8));
        assertTrue(fibonacciService.calculateFibonacci(13));
        assertTrue(fibonacciService.calculateFibonacci(21));

        // Testes com números que não devem estar na sequência de Fibonacci
        assertFalse(fibonacciService.calculateFibonacci(4));
        assertFalse(fibonacciService.calculateFibonacci(6));
        assertFalse(fibonacciService.calculateFibonacci(7));
        assertFalse(fibonacciService.calculateFibonacci(9));
    }
}
