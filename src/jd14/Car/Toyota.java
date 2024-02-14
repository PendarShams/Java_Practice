package jd14.Car;

import jd14.Car.Car;

public class Toyota extends Car {


    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota is starting");
    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving");
    }
}


