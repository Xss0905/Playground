package com.xyh.domain;

public class User {
    private Integer id;

    private String name;

    private Integer phone;

    private String pwd;

    private String ifinto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getIfinto() {
        return ifinto;
    }

    public void setIfinto(String ifinto) {
        this.ifinto = ifinto == null ? null : ifinto.trim();
    }
}