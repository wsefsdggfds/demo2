package com.example.demo.entity;

import java.sql.Timestamp;

public class AccountPassword {
    private String account;
    private String password;
    private String are;
    private String phone;
    private String name;
    private Timestamp relationTIme;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getRelationTIme() {
        return relationTIme;
    }

    public void setRelationTIme(Timestamp relationTIme) {
        this.relationTIme = relationTIme;
    }

    @Override
    public String toString() {
        return "AccountPassword{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", relationTIme=" + relationTIme +
                '}';
    }
}
