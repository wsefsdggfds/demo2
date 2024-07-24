package com.example.demo.generator.domain;


import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName product
 */

public class Product implements Serializable {
    /**
     * 
     */

    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Integer productSpecificationRelationId;

    /**
     * 
     */
    @NotNull(message = "一级分类名字不能为空")
    private Integer firstClassificationId;
    @NotNull(message = "二级分类名字不能为空")
    private Integer secondClassificationId;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String deliveryMethod;

    /**
     * 
     */
    private String detailDesc;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private Date lanchDate;

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
    public Integer getProductSpecificationRelationId() {
        return productSpecificationRelationId;
    }

    /**
     * 
     */
    public void setProductSpecificationRelationId(Integer productSpecificationRelationId) {
        this.productSpecificationRelationId = productSpecificationRelationId;
    }

    /**
     * 
     */
    public Integer getFirstClassificationId() {
        return firstClassificationId;
    }

    public void setFirstClassificationId(Integer firstClassificationId) {
        this.firstClassificationId = firstClassificationId;
    }

    public Integer getSecondClassificationId() {
        return secondClassificationId;
    }

    public void setSecondClassificationId(Integer secondClassificationId) {
        this.secondClassificationId = secondClassificationId;
    }

    /**
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * 
     */
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    /**
     * 
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * 
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 
     */
    public Date getLanchDate() {
        return lanchDate;
    }

    /**
     * 
     */
    public void setLanchDate(Date lanchDate) {
        this.lanchDate = lanchDate;
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
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getProductSpecificationRelationId() == null ? other.getProductSpecificationRelationId() == null : this.getProductSpecificationRelationId().equals(other.getProductSpecificationRelationId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDeliveryMethod() == null ? other.getDeliveryMethod() == null : this.getDeliveryMethod().equals(other.getDeliveryMethod()))
            && (this.getDetailDesc() == null ? other.getDetailDesc() == null : this.getDetailDesc().equals(other.getDetailDesc()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getLanchDate() == null ? other.getLanchDate() == null : this.getLanchDate().equals(other.getLanchDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getProductSpecificationRelationId() == null) ? 0 : getProductSpecificationRelationId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDeliveryMethod() == null) ? 0 : getDeliveryMethod().hashCode());
        result = prime * result + ((getDetailDesc() == null) ? 0 : getDetailDesc().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLanchDate() == null) ? 0 : getLanchDate().hashCode());
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
        sb.append(", description=").append(description);
        sb.append(", productSpecificationRelationId=").append(productSpecificationRelationId);
        sb.append(", status=").append(status);
        sb.append(", deliveryMethod=").append(deliveryMethod);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", lanchDate=").append(lanchDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}