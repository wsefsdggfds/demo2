package com.example.demo.generator.service;

import com.example.demo.generator.domain.*;
import com.example.demo.generator.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class DocumentService {
    @Autowired
    private DocumentMapper documentMapper;
    public List<Document> find(List<ProductDocumentRelation> documentId){
        List<Integer> documents = documentId.stream().map(ProductDocumentRelation::getDocumentId).collect(Collectors.toList());

        List<Document> documentList=documentMapper.select(documents);
        return documentList;
    }
    public List<Document> findClassificationDocument(List<ClassficationDocumentRelation> classificationId){
        List<Integer> documents = classificationId.stream().map(ClassficationDocumentRelation::getDocumentId).collect(Collectors.toList());

        List<Document> documentList=documentMapper.select(documents);
        return documentList;
    }
    public List<Document> findClassificationTopDocument(List<Integer> topDocumentId){
        List<Document> documentList=documentMapper.select(topDocumentId);
        return documentList;
    }

}
