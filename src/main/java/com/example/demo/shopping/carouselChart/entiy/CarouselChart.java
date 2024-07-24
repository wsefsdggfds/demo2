package com.example.demo.shopping.carouselChart.entiy;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public class CarouselChart {
    private List<String> carouseChart;

    public List<String> getCarouseChartAddress() {
        return carouseChart;
    }

    public void setCarouseChartAddress(List<String> carouseChartAddress) {
        this.carouseChart = carouseChartAddress;
    }
}