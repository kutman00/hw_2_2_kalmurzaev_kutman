package com.company;

public class Mother extends Granddad {
    private int growth;
    private String hobby;

    public Mother(String name,int growth, String hobby) {
        super(name);
        this.growth = growth;
        this.hobby = hobby;
    }

    @Override
    public void print() {

        System.out.println("Mother: " + " рост " +growth + " Хобби " + hobby);
    }
}
