package jd14.Car;

import jd14.Car.AutoPark;
import jd14.Car.Car;

public class Mercedes extends Car implements AutoPark {

    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Mercedes is starting");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes is driving");
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes is auto parking");
    }
}
