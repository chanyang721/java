package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class Address {
    private String name;

    public Address(String name) {
        this.name = name;
    }

    public void setAddress(String addressName) {
        this.name = addressName;
    }

    public String getAddressName () {
        return this.name;
    }
}
