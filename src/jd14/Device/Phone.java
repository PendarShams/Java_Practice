package jd14.Device;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public abstract void call(long phoneNum);

    public abstract void text(long phoneNum);

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", hasBattery=" + hasBattery() +
                ", hasPowerButton=" + hasPowerButton() +
                '}';
    }

    public abstract void downloadApp();
}
