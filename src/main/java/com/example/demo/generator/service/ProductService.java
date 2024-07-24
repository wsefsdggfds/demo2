package com.example.demo.generator.service;

import com.example.demo.generator.domain.Product;
import com.example.demo.generator.mapper.ProductMapper;
import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;
//    查询product list
//    // select * from product where name like '%sdad%'
//    List<Product> products = new ArrayList<>();
//    List<Integer> productId = products.stream().map(Product::getId).collect(Collectors.toList());
//    // 标签
    public List<Product> getProduct(Integer id, String name){
        List<Product> products= productMapper.selectProduct(id,name);
        return products;

    }
    public ApiResult addProduct(Product product ){
        productMapper.add(product);
        return ApiResult.success("200");
    }

}
