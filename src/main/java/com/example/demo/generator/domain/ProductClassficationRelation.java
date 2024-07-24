package com.example.demo.generator.domain;

import java.io.Serializable;

/**
 * 
 * @TableName product_classfication_relation
 */
public class ProductClassficationRelation implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer productId;

    /**
     * 
     */
    private Integer classficationId;

    private static final long serialVersionUID = 1L;

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
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 
     */
    public Integer getClassficationId() {
        return classficationId;
    }

    /**
     * 
     */
    public void setClassficationId(Integer classficationId) {
        this.classficationId = classficationId;
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
        ProductClassficationRelation other = (ProductClassficationRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getClassficationId() == null ? other.getClassficationId() == null : this.getClassficationId().equals(other.getClassficationId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getClassficationId() == null) ? 0 : getClassficationId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", classficationId=").append(classficationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}