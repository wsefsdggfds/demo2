//package com.example.demo.generator.service;
//
//
//import com.example.demo.generator.domain.Classfication;
//import com.example.demo.generator.mapper.ClassificationMapper;
//import com.example.demo.model.ApiResult;
//import org.apache.ibatis.annotations.Param;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//
//public class ClassficationService {
//    @Autowired
//    private ClassificationMapper classficationMapper;
//    public ApiResult add(Classfication classfication){
//        int c=classficationMapper.insert(classfication);
//        return ApiResult.success("");
//    }
//
//
////    分类查询，同商品列表分类查询
//
//    public List<Classfication> findClassification(String name,String type,String state){
//        List<Classfication> classfications=classficationMapper.select(name,type,state);
//        return classfications;
//    }
//    public List<Classfication> findClassificationSecond(Integer parentId,String name,String type,String state){
//        List<Classfication> classfications=classficationMapper.selectSecond(parentId,name,type,state);
//
//        return classfications;
//    }
//
//}
