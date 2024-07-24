package com.example.demo.generator.domain;

import java.io.Serializable;

/**
 * 
 * @TableName product_specification_relation
 */
public class ProductSpecificationRelation implements Serializable {
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
    private Integer specificationId;

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
    public Integer getSpecificationId() {
        return specificationId;
    }

    /**
     * 
     */
    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
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
        ProductSpecificationRelation other = (ProductSpecificationRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getSpecificationId() == null ? other.getSpecificationId() == null : this.getSpecificationId().equals(other.getSpecificationId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getSpecificationId() == null) ? 0 : getSpecificationId().hashCode());
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
        sb.append(", specificationId=").append(specificationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}