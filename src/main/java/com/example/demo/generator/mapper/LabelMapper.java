package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.Label;
import com.example.demo.generator.domain.ProductLabelRelation;

import java.util.List;

/**
* @author wwx92
* @description 针对表【lable】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.Lable
*/
public interface LabelMapper {
    //select * from label where id in () 根据商品标签关系表查询标签名字
    List<Label> selectName(List<Integer> labelId);

    int insert(Label label);

}



