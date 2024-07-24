package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.Classfication;
import com.example.demo.generator.domain.ClassficationDocumentRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wwx92
* @description 针对表【classfication_document_relation】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.ClassficationDocumentRelation
*/
public interface ClassficationDocumentRelationMapper{
    int save(ClassficationDocumentRelation classficationDocumentRelation);
    List<ClassficationDocumentRelation> selectDocument(@Param("list") List<Integer> a);


}




