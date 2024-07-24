package com.example.demo.shopping.classification.secondary.service;

import com.example.demo.shopping.classification.primary.entiy.PrimaryClassification;
import com.example.demo.shopping.classification.primary.mapper.PrimaryClassificationMapper;
import com.example.demo.shopping.classification.secondary.entiy.SecondaryClassification;
import com.example.demo.shopping.classification.secondary.mapper.SecondaryClassificationMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondaryService {
    @Autowired
    private SecondaryClassificationMapper secondaryClassificationMapper;
    public void update(SecondaryClassification secondaryClassification){
        SecondaryClassification secondaryClassification1=new SecondaryClassification();
        BeanUtils.copyProperties(secondaryClassification,secondaryClassification1);
        secondaryClassificationMapper.updateSecondary(secondaryClassification);
    }
}
