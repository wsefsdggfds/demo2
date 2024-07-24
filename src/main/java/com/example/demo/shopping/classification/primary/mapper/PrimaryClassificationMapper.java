package com.example.demo.shopping.classification.primary.mapper;

import com.example.demo.shopping.classification.primary.entiy.PrimaryClassification;

public interface PrimaryClassificationMapper {
    int updatePrimary(PrimaryClassification primaryClassification);
    int insertPrimary(PrimaryClassification primaryClassification);
}
