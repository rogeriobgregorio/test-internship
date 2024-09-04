package com.rogeriogregorio.percentage_api.services;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevenueServiceImplTest {

    @Test
    public void testCalculatePercentages() {
        // Arrange
        RevenueServiceImpl revenueServiceImpl = new RevenueServiceImpl();
        Map<String, Double> percentages = revenueServiceImpl.calculatePercentages();
        double total = 67836.43 + 36678.66 + 29229.88 + 27165.48 + 19849.53;
        double spPercentage = (67836.43 / total) * 100;
        double rjPercentage = (36678.66 / total) * 100;
        double mgPercentage = (29229.88 / total) * 100;
        double esPercentage = (27165.48 / total) * 100;
        double othersPercentage = (19849.53 / total) * 100;

        // Act and Asserts
        assertEquals(spPercentage, percentages.get("SP"), 0.01);
        assertEquals(rjPercentage, percentages.get("RJ"), 0.01);
        assertEquals(mgPercentage, percentages.get("MG"), 0.01);
        assertEquals(esPercentage, percentages.get("ES"), 0.01);
        assertEquals(othersPercentage, percentages.get("Outros"), 0.01);
    }
}
