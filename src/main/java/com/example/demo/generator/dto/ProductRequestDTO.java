package com.example.demo.generator.dto;

import com.example.demo.generator.domain.Document;
import com.example.demo.generator.domain.Label;
import com.example.demo.generator.domain.Specification;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//前端传输的字段
public class ProductRequestDTO implements Serializable {

    private String name;

    private String description;
    private List<Document> documentList;
    private List<Specification> specificationList;
    private List<Label> lableList;
    private Integer firstClassficationId;
    private Integer secondClassficationId;
    private String deliveryMethod;

    private String detailDesc;

    private String status;

    private Date lanchDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public List<Specification> getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(List<Specification> specificationList) {
        this.specificationList = specificationList;
    }

    public List<Label> getLableList() {
        return lableList;
    }

    public void setLableList(List<Label> lableList) {
        this.lableList = lableList;
    }

    public Integer getFirstClassficationId() {
        return firstClassficationId;
    }

    public void setFirstClassficationId(Integer firstClassficationId) {
        this.firstClassficationId = firstClassficationId;
    }

    public Integer getSecondClassficationId() {
        return secondClassficationId;
    }

    public void setSecondClassficationId(Integer secondClassficationId) {
        this.secondClassficationId = secondClassficationId;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLanchDate() {
        return lanchDate;
    }

    public void setLanchDate(Date lanchDate) {
        this.lanchDate = lanchDate;
    }
}
