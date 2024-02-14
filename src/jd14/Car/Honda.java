package jd14.Car;

import jd14.Car.Car;

public class Honda extends Car {
    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda is starting");
    }

    @Override
    public void drive() {
        System.out.println("Honda is driving");
    }
}
