package jd14.Car;

import jd14.Car.AutoPark;
import jd14.Car.AutoPilot;
import jd14.Car.Car;

public class Nio extends Car implements AutoPilot, AutoPark {

    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Nio is starting");
    }

    @Override
    public void drive() {
        System.out.println("Nio is driving");
    }

    @Override
    public void autoPark() {
        System.out.println("Nio is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio is self-driving");
    }
}
