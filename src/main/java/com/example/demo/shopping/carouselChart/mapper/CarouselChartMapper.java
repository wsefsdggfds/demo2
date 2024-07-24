package com.example.demo.shopping.carouselChart.mapper;

import com.example.demo.shopping.carouselChart.entiy.CarouselChart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarouselChartMapper {
    int insert( List<String> carouseChart);
}
