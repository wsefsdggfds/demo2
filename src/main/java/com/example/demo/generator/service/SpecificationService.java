package com.example.demo.generator.service;

import com.example.demo.generator.domain.ProductDocumentRelation;
import com.example.demo.generator.domain.ProductLabelRelation;
import com.example.demo.generator.domain.ProductSpecificationRelation;
import com.example.demo.generator.domain.Specification;
import com.example.demo.generator.mapper.SpecificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;
//    通过商品规格关系表规格id查询规格信息
    public List<Specification> select(List<ProductSpecificationRelation> specificationId){
        List<Integer> specifications = specificationId.stream().map(ProductSpecificationRelation::getSpecificationId).collect(Collectors.toList());
        List<Specification>  specification=specificationMapper.getByProductId(specifications);
        return specification;
    }
    public List<Specification> getPriceSpecifications(List<ProductSpecificationRelation> specificationId){
        List<Integer> specifications=specificationId.stream().map(ProductSpecificationRelation::getSpecificationId).collect(Collectors.toList());
        List<Specification> specificationList=specificationMapper.getPriceSpecifications(specifications);
        return specificationList;
    }
}
