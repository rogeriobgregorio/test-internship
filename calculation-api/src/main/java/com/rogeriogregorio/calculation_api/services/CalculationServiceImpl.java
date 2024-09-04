package com.rogeriogregorio.calculation_api.services;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService{

    public int calculateSoma() {

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        return soma;
    }
}
