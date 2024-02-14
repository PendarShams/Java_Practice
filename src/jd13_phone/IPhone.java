package jd13_phone;

public class IPhone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String colour;

    public IPhone(String brand, String model, String size, double price, String colour) {
        this.setBrand(brand);
        this.setModel(model);
        this.setSize(size);
        this.setPrice(price);
        this.setColour(colour);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be null or empty");
        }
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == null || colour.trim().isEmpty()) {
            throw new IllegalArgumentException("Colour cannot be null or empty");
        }
        this.colour = colour;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling the number " + phoneNumber);
    }

    public void text(String phoneNumber) {
        System.out.println("Texting to the number " + phoneNumber);
    }

    public void faceTime(String phoneNumber) {
        System.out.println("Facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}