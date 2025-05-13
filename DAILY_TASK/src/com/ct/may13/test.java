package com.ct.may13;
enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

public class test {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.getAbbreviation());
    }
}