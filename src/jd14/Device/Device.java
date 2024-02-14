package jd14.Device;

public abstract class Device {

    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private final boolean hasBattery;
    private final boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean hasBattery() {
        return hasBattery;
    }

    public boolean hasPowerButton() {
        return hasPowerButton;
    }


    public abstract void turnOn();

    public abstract void turnOff();


    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }

}
