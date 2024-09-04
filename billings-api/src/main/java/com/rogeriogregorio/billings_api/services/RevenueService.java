package com.rogeriogregorio.billings_api.services;

import com.rogeriogregorio.billings_api.dto.RevenueStatistics;
import com.rogeriogregorio.billings_api.entities.Revenue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RevenueService {

    RevenueStatistics calculateRevenueStatistics(List<Revenue> revenues);
}
