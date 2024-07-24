package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.Classfication;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author wwx92
* @description 针对表【classfication】的数据库操作Mapper
* @createDate 2024-07-14 21:00:56
* @Entity generator.domain.Classfication
*/
public interface ClassificationMapper {
//    添加分类
    int insert(Classfication classification);
//    查询分类，同商品管理页中查询分类
    List<Classfication> select(@Param("name") String name,@Param("type") String type,@Param("state") String state);
    List<Classfication> selectSecond(@Param("parentId") Integer parentId,@Param("name") String name,@Param("type") String type,@Param("state") String state);

}




