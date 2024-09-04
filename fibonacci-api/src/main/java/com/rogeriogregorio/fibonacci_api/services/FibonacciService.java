package com.rogeriogregorio.fibonacci_api.services;

import org.springframework.stereotype.Component;

@Component
public interface FibonacciService {

    String isFibonacci(int number);
}
