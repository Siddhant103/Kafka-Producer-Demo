package com.techprimer.kafkaProducerdemo.model;

public class User {
    private String name;
    private String dept;
    private Long num;

    public User(String name, String dept, Long num) {
        this.name = name;
        this.dept = dept;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
