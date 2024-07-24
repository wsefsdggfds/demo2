package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.Product;
import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author wwx92
* @description 针对表【product】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.Product
*/
 public interface ProductMapper   {
//    根据姓名查询是模糊查询
    List<Product> selectProduct(@Param("id") Integer id, @Param("name") String name );
//    List<Product> selectClassificationById(List<Integer> productId);
//    添加product
    int add(Product product);

}




