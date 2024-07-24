package com.example.demo.shopping.carouselChart.controller;

import com.example.demo.model.ApiResult;
import com.example.demo.shopping.carouselChart.entiy.CarouselChart;
import com.example.demo.shopping.carouselChart.service.CarouselChartService;
import jakarta.websocket.server.PathParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carouselChat")
public class CarouselChartController {
    @Autowired
    private CarouselChartService carouselChartService;
    @PostMapping("/insert")
    public ApiResult insert(@RequestBody List<String> carouseChart){
        return  carouselChartService.insertCarouselChart(carouseChart);
    }
}
