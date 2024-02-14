package jd14.Car;

public class Audi extends Car implements AutoPark {

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Audi is starting");
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving");
    }

    @Override
    public void autoPark() {
        System.out.println("Audi is auto parking");
    }

}
