package com.rogeriogregorio.percentage_api.services;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface RevenueService {

    Map<String, Double> calculatePercentages();
}
