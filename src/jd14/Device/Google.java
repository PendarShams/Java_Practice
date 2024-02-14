package jd14.Device;

public class Google extends Phone implements Downloadable, AndroidApps{

    public Google(String model, double price, String color, String size) {
        super("Google", model, price, color, size, true, true);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Google phone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Google phone");
    }

    @Override
    public void call(long phoneNum) {
        System.out.println("Calling " + phoneNum + " from Google phone");
    }

    @Override
    public void text(long phoneNum) {
        System.out.println("Texting " + phoneNum + " from Google phone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from Google Play Store");
    }
}

