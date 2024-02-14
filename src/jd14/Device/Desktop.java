package jd14.Device;

public class Desktop extends PersonalComputer{

    public Desktop(String model, double price, String color, String size) {
        super(model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turning off.");
    }
}
