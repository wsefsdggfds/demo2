//package com.example.demo.shopping.label.service;
//
//import com.example.demo.model.ApiResult;
//import com.example.demo.shopping.label.entiy.Label;
//import com.example.demo.shopping.label.mapper.LabelMapper;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//
//@Service
//public class LabelServiceT {
//    @Autowired
//    private LabelMapper labelMapper;
//
//    public ApiResult insert(Label label) {
//        if (!StringUtils.isEmpty(label.getName())){
//            if (label.getName().length()>1&&label.getName().length()<5){
//                if(!StringUtils.isEmpty(label.getColour())){
//                    labelMapper.insertLabel(label);
//                    return ApiResult.success("200");
//                }else {
//                    return ApiResult.failure("标签配色不能为空");
//                }
//            }else {
//              return ApiResult.failure("标签名字必须在2~4个字之间");
//            }
//        }else{
//            return ApiResult.failure("标签名字不能为空");
//        }
//    }
//
//    public void delete(Label label) {
//        Label label1 = new Label();
//        BeanUtils.copyProperties(label, label1);
//        labelMapper.delete(label);
//    }
//}