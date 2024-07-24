package com.example.demo.shopping.specifications.entiy;
//商品规格
public class Specifications {

    private int id;
    private int superId;
    //定价
    private double price;
    //属性
    private String attribute;
    //促销价格
    private double promotionalPrice;
    //图片
    private String picture[];
    //单件重量
    private double singlePieceWeight;
    //库存
    private int inventory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuperId() {
        return superId;
    }

    public void setSuperId(int superId) {
        this.superId = superId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    public String[] getPicture() {
        return picture;
    }

    public void setPicture(String[] picture) {
        this.picture = picture;
    }

    public double getSinglePieceWeight() {
        return singlePieceWeight;
    }

    public void setSinglePieceWeight(double singlePieceWeight) {
        this.singlePieceWeight = singlePieceWeight;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
