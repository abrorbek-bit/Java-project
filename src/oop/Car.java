package oop;

public class Car {
    int year;
    String name;
    String model;

    public Car() {
    }

    public Car(String model, String name, int year) {
        this.model = model;
        this.name = name;
        this.year = year;
    }

    public Car(String name, int year) {
        this("Chevrolet", name, year);
    }

    public void introduce() {
        System.out.println("Model:\t" + model + "\t\tName:\t" + name + "\t\tYear: " + year);
    }
}