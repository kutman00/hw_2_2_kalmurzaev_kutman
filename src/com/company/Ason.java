package com.company;

public class Ason extends Granddad {
    private String profession;

    public Ason(String name, String profession) {
        super(name);
        this.profession = profession;
    }

    @Override
    public void print() {
        System.out.println("Son: " + "Профессия" + profession);
    }
}
