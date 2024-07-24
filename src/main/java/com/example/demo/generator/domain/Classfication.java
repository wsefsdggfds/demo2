package com.example.demo.generator.domain;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @TableName classfication
 */
public class Classfication implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    @NotNull(message = "分类名字不能为空")
    private String name;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private Integer parentId;

    /**
     * 
     */
    private Integer sort;
    private String state;


    /**
     * 
     */
    private Integer topDocumentId;

    private List<Document> documentList;
    Document topDocument;
    private static final long serialVersionUID = 1L;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public Document getTopDocument() {
        return topDocument;
    }

    public void setTopDocument(Document topDocument) {
        this.topDocument = topDocument;
    }

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     */
    public Integer getTopDocumentId() {
        return topDocumentId;
    }

    /**
     * 
     */
    public void setTopDocumentId(Integer topDocumentId) {
        this.topDocumentId = topDocumentId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Classfication other = (Classfication) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getTopDocumentId() == null ? other.getTopDocumentId() == null : this.getTopDocumentId().equals(other.getTopDocumentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getTopDocumentId() == null) ? 0 : getTopDocumentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", parentId=").append(parentId);
        sb.append(", sort=").append(sort);
        sb.append(", topDocumentId=").append(topDocumentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public enum Type{
        First_Level,Second_Level
    }
}