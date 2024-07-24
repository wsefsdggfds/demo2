package com.example.demo.generator.service;

import com.example.demo.generator.domain.Label;
import com.example.demo.generator.domain.ProductLabelRelation;
import com.example.demo.generator.mapper.LabelMapper;
import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class LabelService {

    @Autowired
    private LabelMapper labelMapper;

    public ApiResult add(Label label){

        int i = labelMapper.insert(label);
        return ApiResult.success("");
    }
    //根据商品标签关系表中查询到的标签id查询标签名字
    public List<Label> get(List<ProductLabelRelation> labelId){
        List<Integer> labelids = labelId.stream().map(ProductLabelRelation::getLabelId).collect(Collectors.toList());
        List<Label> labels=labelMapper.selectName(labelids);
        return labels;
    }




}
