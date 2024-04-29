package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {

    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, this.month, this.day);
    }

    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(this.year, month, this.day);
    }

    public ImmutableMyDate withDay(int day) {
        return new ImmutableMyDate(this.year, this.month, day);
    }

    @Override
    public String toString() {
        return STR."ImmutableMyDate{year=\{year}, month=\{month}, day=\{day}\{'}'}";
    }
}
