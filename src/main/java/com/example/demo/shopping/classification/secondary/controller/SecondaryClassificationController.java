package com.example.demo.shopping.classification.secondary.controller;

import com.example.demo.shopping.classification.primary.entiy.PrimaryClassification;
import com.example.demo.shopping.classification.primary.mapper.PrimaryClassificationMapper;
import com.example.demo.shopping.classification.primary.service.PrimaryService;
import com.example.demo.shopping.classification.secondary.entiy.SecondaryClassification;
import com.example.demo.shopping.classification.secondary.mapper.SecondaryClassificationMapper;
import com.example.demo.shopping.classification.secondary.service.SecondaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secondary")
public class SecondaryClassificationController {
    @Autowired
    private SecondaryService secondaryService;
    @Autowired
    private SecondaryClassificationMapper secondaryClassificationMapper;
    @PostMapping("/update")
    public String update(@RequestBody SecondaryClassification secondaryClassification){
        secondaryClassificationMapper.updateSecondary(secondaryClassification);
        return "删除成功";
    }
}
