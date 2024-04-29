package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class ImmutableMember {
    private String name;
    private ImmutableAddress address; // 상수

    public ImmutableMember(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAddress getAddress () {
        return this.address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }
}
