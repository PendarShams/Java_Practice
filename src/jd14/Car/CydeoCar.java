package jd14.Car;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("CydeoCar is starting");
    }

    @Override
    public void drive() {
        System.out.println("CydeoCar is driving");
    }

    @Override
    public void autoPark() {
        System.out.println("CydeoCar is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("CydeoCar is self-driving");
    }

    @Override
    public void fly() {
        System.out.println("CydeoCar is flying");
    }
}