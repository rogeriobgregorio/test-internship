package com.rogeriogregorio.fibonacci_api.services;

import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService{

    public boolean calculateFibonacci(int number) {

        if (number < 0) {
            return false;
        }

        int a = 0, b = 1;
        if (number == a || number == b) {
            return true;
        }

        int c = a + b;
        while (c <= number) {
            if (c == number) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }

    public String isFibonacci(int number) {

        return calculateFibonacci(number) ?
                number + " pertence à sequência de Fibonacci." :
                number + " não pertence à sequência de Fibonacci.";
    }
}
