package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class Member {
    private String name;
    private Address address;

    public Member(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address newAddress) {
        this.address = newAddress;
    }
}
