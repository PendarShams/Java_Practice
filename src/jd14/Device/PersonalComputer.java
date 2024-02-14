package jd14.Device;

public class PersonalComputer extends Computer{

    public PersonalComputer(String model, double price, String color, String size) {
        super("Generic", model, price, color, size, false, true);
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
