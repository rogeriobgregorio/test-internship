package com.rogeriogregorio.percentage_api.controllers;

import com.rogeriogregorio.percentage_api.services.RevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/revenue")
public class RevenueController {

    private final RevenueService revenueService;

    @Autowired
    public RevenueController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    @GetMapping("/percentages")
    public Map<String, Double> getRevenuePercentages() {
        return revenueService.calculatePercentages();
    }
}

