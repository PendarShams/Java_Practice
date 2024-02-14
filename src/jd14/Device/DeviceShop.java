package jd14.Device;

public class DeviceShop {

    public static void main(String[] args) {

        Phone iphone = new IPhone("15", 999.99, "Black", "6.1 inches");
        System.out.println(iphone);
        iphone.turnOn();
        iphone.call(1111111111);
        iphone.text(1111111111);
        iphone.downloadApp();
        iphone.turnOff();
        System.out.println();

        Phone samsung = new Samsung("Galaxy", 899.99, "Black", "6.2 inches");
        System.out.println(samsung);
        samsung.turnOn();
        samsung.call(222222222);
        samsung.text(222222222);
        samsung.downloadApp();
        samsung.turnOff();
        System.out.println();

        Phone google = new Google("Pixel", 799.99, "Black", "6.3 inches");
        System.out.println(google);
        google.turnOn();
        google.call(333333333);
        google.text(333333333);
        google.downloadApp();
        google.turnOff();
        System.out.println();

        Computer desktop = new Desktop("Dell Inspiron", 799.99, "Black", "24 inches");
        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();
        System.out.println();

        Computer laptop = new Laptop("MacBook Pro", 1499.99, "Silver", "13 inches");
        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();
    }

}
