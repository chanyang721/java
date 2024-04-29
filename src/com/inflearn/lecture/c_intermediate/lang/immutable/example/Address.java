package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class Address {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Address setAddress(String address) {
        return new Address(address);
    }
}
