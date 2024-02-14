package jd13_phone;

public class PhoneClients {
    public static void main(String[] args) {


        IPhone iphone = new IPhone("Apple", "12 Pro", "6.1 inches", 999.99, "Space Gray");
        Samsung samsung = new Samsung("Samsung", "Galaxy S21", "6.2 inches", 799.99, "Phantom Violet");
        Nokia nokia = new Nokia("Nokia", "Windows", "6 inches", 599.99, "White");


        System.out.println("iPhone:");
        System.out.println("Brand: " + iphone.getBrand());
        System.out.println("Model: " + iphone.getModel());
        System.out.println("Size: " + iphone.getSize());
        System.out.println("Price: $" + iphone.getPrice());
        System.out.println("Colour: " + iphone.getColour());
        iphone.call("1234567890");
        iphone.text("1234567890");
        System.out.println(iphone);

        System.out.println("\nSamsung:");
        System.out.println("Brand: " + samsung.getBrand());
        System.out.println("Model: " + samsung.getModel());
        System.out.println("Size: " + samsung.getSize());
        System.out.println("Price: $" + samsung.getPrice());
        System.out.println("Colour: " + samsung.getColour());
        samsung.call("5144444444");
        samsung.text("5145555555");
        System.out.println(samsung);

        System.out.println("\nNokia:");
        System.out.println("Brand: " + nokia.getBrand());
        System.out.println("Model: " + nokia.getModel());
        System.out.println("Size: " + nokia.getSize());
        System.out.println("Price: $" + nokia.getPrice());
        System.out.println("Colour: " + nokia.getColour());
        nokia.call("514555555");
        nokia.text("514666666");
        System.out.println(nokia);
    }
}
