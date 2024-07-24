package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.Document;
import com.example.demo.generator.domain.ProductDocumentRelation;

import java.util.List;

/**
* @author wwx92
* @description 针对表【document】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.Document
*/
public interface DocumentMapper   {
    int save(Document document);
    List<Document> select(List<Integer> documentId);

}




