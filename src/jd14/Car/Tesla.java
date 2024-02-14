package jd14.Car;

import jd14.Car.AutoPark;
import jd14.Car.AutoPilot;
import jd14.Car.Car;

public class Tesla extends Car implements AutoPark, AutoPilot {

    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving");
    }
}
