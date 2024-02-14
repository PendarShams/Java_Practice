package jd13_phone;

public class Samsung extends IPhone {
    public Samsung(String brand, String model, String size, double price, String colour) {
        super(brand, model, size, price, colour);
    }

        public void call(String phoneNumber) {
            System.out.println("Calling the number " + phoneNumber);
        }

        public void text(String phoneNumber) {
            System.out.println("Texting to the number " + phoneNumber);
        }

    @Override
    public String toString() {
        return super.toString();
    }
}



