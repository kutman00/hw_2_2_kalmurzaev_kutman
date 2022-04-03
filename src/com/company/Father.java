package com.company;

public class Father extends Granddad{
    private int age;
    private String color;


    public Father(String name, int age, String color) {
        super(name);
        this.age = age;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Father: " + "Кутман " +  + age + " лет " + "цвет глаз " + color );
    }
}
