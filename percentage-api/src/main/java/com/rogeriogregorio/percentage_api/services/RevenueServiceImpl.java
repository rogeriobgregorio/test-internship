package com.rogeriogregorio.percentage_api.services;

import com.rogeriogregorio.percentage_api.entities.Revenue;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RevenueServiceImpl implements RevenueService {

    public final List<Revenue> revenues = List.of(
            new Revenue("SP", 67836.43),
            new Revenue("RJ", 36678.66),
            new Revenue("MG", 29229.88),
            new Revenue("ES", 27165.48),
            new Revenue("Outros", 19849.53)
    );

    public Map<String, Double> calculatePercentages() {

        double total = revenues.stream()
                .mapToDouble(Revenue::getAmount)
                .sum();

        return revenues.stream()
                .collect(Collectors.toMap(
                        Revenue::getState,
                        revenue -> (revenue.getAmount() / total) * 100
                ));
    }
}
