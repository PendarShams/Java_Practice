package jd14.Device;

public class IPhone extends Phone implements AppleApps, Downloadable {

    public IPhone(String model, double price, String color, String size) {
        super("Apple", model, price, color, size, true, true);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on iPhone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off iPhone");
    }

    @Override
    public void call(long phoneNum) {
        System.out.println("Calling " + phoneNum + " from iPhone");
    }

    @Override
    public void text(long phoneNum) {
        System.out.println("Texting " + phoneNum + " from iPhone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from App Store");
    }
}
