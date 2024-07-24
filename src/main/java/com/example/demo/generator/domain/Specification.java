package com.example.demo.generator.domain;

import java.io.Serializable;

/**
 * 
 * @TableName specification
 */
public class Specification implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Integer price;

    /**
     * 
     */
    private Integer isSalesPrice;

    /**
     * 
     */
    private Integer salesPrice;

    /**
     * 
     */
    private Integer documentId;

    /**
     * 
     */
    private Integer number;

    /**
     * 
     */
    private Integer stock;

    /**
     * 
     */
    private Integer weight;

    /**
     * 
     */
    private Integer sort;

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
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     */
    public Integer getIsSalesPrice() {
        return isSalesPrice;
    }

    /**
     * 
     */
    public void setIsSalesPrice(Integer isSalesPrice) {
        this.isSalesPrice = isSalesPrice;
    }

    /**
     * 
     */
    public Integer getSalesPrice() {
        return salesPrice;
    }

    /**
     * 
     */
    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * 
     */
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * 
     */
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    /**
     * 
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
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
        Specification other = (Specification) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getIsSalesPrice() == null ? other.getIsSalesPrice() == null : this.getIsSalesPrice().equals(other.getIsSalesPrice()))
            && (this.getSalesPrice() == null ? other.getSalesPrice() == null : this.getSalesPrice().equals(other.getSalesPrice()))
            && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getIsSalesPrice() == null) ? 0 : getIsSalesPrice().hashCode());
        result = prime * result + ((getSalesPrice() == null) ? 0 : getSalesPrice().hashCode());
        result = prime * result + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", description=").append(description);
        sb.append(", price=").append(price);
        sb.append(", isSalesPrice=").append(isSalesPrice);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", documentId=").append(documentId);
        sb.append(", number=").append(number);
        sb.append(", stock=").append(stock);
        sb.append(", weight=").append(weight);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}