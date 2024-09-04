package com.rogeriogregorio.billings_api.services;

import com.rogeriogregorio.billings_api.dto.RevenueStatistics;
import com.rogeriogregorio.billings_api.entities.Revenue;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevenueServiceImplTest {

    @Test
    public void testCalculateRevenueStatistics() {
        // Arrange
        RevenueServiceImpl service = new RevenueServiceImpl();

        List<Revenue> revenues = Arrays.asList(
                new Revenue(1, 22174.1664),
                new Revenue(2, 24537.6698),
                new Revenue(3, 26139.6134),
                new Revenue(4, 0.0),
                new Revenue(5, 0.0),
                new Revenue(6, 26742.6612),
                new Revenue(7, 0.0),
                new Revenue(8, 42889.2258),
                new Revenue(9, 46251.174),
                new Revenue(10, 11191.4722),
                new Revenue(11, 0.0),
                new Revenue(12, 0.0),
                new Revenue(13, 3847.4823),
                new Revenue(14, 373.7838),
                new Revenue(15, 2659.7563),
                new Revenue(16, 48924.2448),
                new Revenue(17, 18419.2614),
                new Revenue(18, 0.0),
                new Revenue(19, 0.0),
                new Revenue(20, 35240.1826),
                new Revenue(21, 43829.1667),
                new Revenue(22, 18235.6852),
                new Revenue(23, 4355.0662),
                new Revenue(24, 13327.1025),
                new Revenue(25, 0.0),
                new Revenue(26, 0.0),
                new Revenue(27, 25681.8318),
                new Revenue(28, 1718.1221),
                new Revenue(29, 13220.495),
                new Revenue(30, 8414.61)
        );

        // Act
        RevenueStatistics stats = service.calculateRevenueStatistics(revenues);

        // Asserts
        assertEquals(373.7838, stats.getMin());
        assertEquals(48924.2448, stats.getMax());
        assertEquals(10, stats.getDaysAboveAverage());
    }
}
