package com.example.demo.shopping.account.entity;

import java.sql.Timestamp;

public class Account {
    private String name;
    private String phone;
    private String role;
    private Timestamp endTime;
    private String landIp;
    private String landState;
    private String eMail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getLandIp() {
        return landIp;
    }

    public void setLandIp(String landIp) {
        this.landIp = landIp;
    }

    public String getLandState() {
        return landState;
    }

    public void setLandState(String landState) {
        this.landState = landState;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
