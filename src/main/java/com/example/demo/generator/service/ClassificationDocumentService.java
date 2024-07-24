package com.example.demo.generator.service;

import com.example.demo.generator.domain.ClassficationDocumentRelation;
import com.example.demo.generator.domain.ProductDocumentRelation;
import com.example.demo.generator.mapper.ClassficationDocumentRelationMapper;
import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationDocumentService {
    @Autowired
    private ClassficationDocumentRelationMapper classficationDocumentRelationMapper;
    public List<ClassficationDocumentRelation> findDocumentId(List<Integer> classficationId){
        List<ClassficationDocumentRelation> classficationDocumentRelations=classficationDocumentRelationMapper.selectDocument(classficationId);
        return classficationDocumentRelations;
    }
}
