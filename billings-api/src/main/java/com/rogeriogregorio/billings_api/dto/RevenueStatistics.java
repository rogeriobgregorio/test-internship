package com.rogeriogregorio.billings_api.dto;

public class RevenueStatistics {

    private final double min;
    private final double max;
    private final long daysAboveAverage;

    public RevenueStatistics(double min, double max, long daysAboveAverage) {
        this.min = min;
        this.max = max;
        this.daysAboveAverage = daysAboveAverage;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public long getDaysAboveAverage() {
        return daysAboveAverage;
    }
}

