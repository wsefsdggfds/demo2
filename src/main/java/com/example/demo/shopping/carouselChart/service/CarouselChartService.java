package com.example.demo.shopping.carouselChart.service;

import com.example.demo.model.ApiResult;
import com.example.demo.shopping.carouselChart.entiy.CarouselChart;
import com.example.demo.shopping.carouselChart.mapper.CarouselChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CarouselChartService {
    @Autowired
    private CarouselChartMapper carouselChartMapper;

        //    新增轮播图
        public ApiResult insertCarouselChart(List<String> carouseChart){
//           if(!StringUtils.isEmpty(carouseChart)){
//                if (carouseChart.size()<7){

                    carouselChartMapper.insert(carouseChart);
                    return ApiResult.success(200);
//                } else {
//                   return ApiResult.failure("轮播图片数量不能多余6张");
//               }
//
//            } else {
//                return ApiResult.failure("请插入轮播图");
//            }
       }

}
