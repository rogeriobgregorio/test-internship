package com.rogeriogregorio.billings_api.services;

import com.rogeriogregorio.billings_api.dto.RevenueStatistics;
import com.rogeriogregorio.billings_api.entities.Revenue;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class RevenueServiceImpl implements RevenueService {

    public RevenueStatistics calculateRevenueStatistics(List<Revenue> revenues) {

        List<Double> values = revenues.stream()
                .map(Revenue::getValue)
                .filter(value -> value > 0)
                .toList();

        OptionalDouble averageOptional = values.stream()
                .mapToDouble(Double::doubleValue)
                .average();
        double average = averageOptional.orElse(0.0);

        double min = values.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
        double max = values.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);

        long daysAboveAverage = values.stream()
                .filter(value -> value > average)
                .count();

        return new RevenueStatistics(min, max, daysAboveAverage);
    }
}
