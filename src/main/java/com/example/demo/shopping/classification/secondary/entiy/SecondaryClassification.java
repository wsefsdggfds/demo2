package com.example.demo.shopping.classification.secondary.entiy;

public class SecondaryClassification {
    //二级分类
    //分类id自增
    private int id;
    //分类图片
    private String picture;
    //分类名称
    private String classificationName;
    //顶部图片
    private String topPicture;
    //商品数量
    private int number;
    //状态
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public String getTopPicture() {
        return topPicture;
    }

    public void setTopPicture(String topPicture) {
        this.topPicture = topPicture;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
