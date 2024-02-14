package jd14.Device;

public class Samsung extends Phone implements Downloadable, AndroidApps{

    public Samsung(String model, double price, String color, String size) {
        super("Samsung", model, price, color, size, true, true);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Samsung phone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Samsung phone");
    }

    @Override
    public void call(long phoneNum) {
        System.out.println("Calling " + phoneNum + " from Samsung phone");
    }

    @Override
    public void text(long phoneNum) {
        System.out.println("Texting " + phoneNum + " from Samsung phone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from Google Play Store");
    }
}

