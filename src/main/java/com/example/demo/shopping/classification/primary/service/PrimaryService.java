package com.example.demo.shopping.classification.primary.service;

import com.example.demo.shopping.classification.primary.entiy.PrimaryClassification;
import com.example.demo.shopping.classification.primary.mapper.PrimaryClassificationMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PrimaryService {
    @Autowired
    private PrimaryClassificationMapper primaryClassificationMapper;
    public void update(PrimaryClassification primaryClassification){
        PrimaryClassification primaryClassification1=new PrimaryClassification();
        BeanUtils.copyProperties(primaryClassification,primaryClassification1);
        primaryClassificationMapper.updatePrimary(primaryClassification);
    }
    public void insert(PrimaryClassification primaryClassification){
        PrimaryClassification primaryClassification1=new PrimaryClassification();
        BeanUtils.copyProperties(primaryClassification,primaryClassification1);
        primaryClassificationMapper.updatePrimary(primaryClassification);
    }
}
