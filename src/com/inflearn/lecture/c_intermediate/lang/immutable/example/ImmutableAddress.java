package com.inflearn.lecture.c_intermediate.lang.immutable.example;


public class ImmutableAddress {
    private final String name;

    public ImmutableAddress(String name) {
        this.name = name;
    }

    public ImmutableAddress withName(String address) {
        return new ImmutableAddress("new address");
    }

    public String getName() {
        return this.name;
    }
}
