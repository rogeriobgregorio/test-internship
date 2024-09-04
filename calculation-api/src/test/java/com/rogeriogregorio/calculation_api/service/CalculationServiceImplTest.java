package com.rogeriogregorio.calculation_api.service;

import com.rogeriogregorio.calculation_api.services.CalculationServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationServiceImplTest {

    @Test
    public void testCalculateSoma() {
        // Arrange
        CalculationServiceImpl calculationService = new CalculationServiceImpl();

        // Act
        int result = calculationService.calculateSoma();

        // Assert
        assertEquals(91, result);
    }
}
