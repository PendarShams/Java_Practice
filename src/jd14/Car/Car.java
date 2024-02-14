package jd14.Car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;


    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    private void setMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        }
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        if (year < 1886) {
            throw new IllegalArgumentException("Year must be greater than or equal to 1886");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
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


    public abstract void start();

    public abstract void drive();


    public void stop() {
        System.out.println("Car has stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


