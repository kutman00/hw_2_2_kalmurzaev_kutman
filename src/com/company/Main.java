package com.company;

public class Main {

    public static void main(String[] args) {
        Granddad[] granddads = {
                createObject("Father"), createObject("Mother"), createObject("Ason")};
        for (int i = 0; i < granddads.length; i++) {
            granddads[i].print();
        }
    }

    public static Granddad createObject(String className) {
        Father father = new Father("Kutman ", 50, " black");
        Mother mother = new Mother("Айка ", 160, " Читать книгу ");
        Ason ason = new Ason("Акыл ", " Программирования ");
        switch (className) {

            case "Father":

                return father;
            case "Mother":

                return mother;
            case "Ason":

                return ason;
        }
        Granddad[] granddad = {
                father, mother, ason
        };
        return null;
    }

}
