package jd14.Car;

public class CarClients {
    public static void main(String[] args) {

        Car toyota = new Toyota("Camry", 2022, 25000, "Black");
        toyota.start();
        toyota.drive();
        toyota.stop();
        System.out.println(toyota);

        Car honda = new Honda("Civic", 2023, 22000, "White");
        honda.start();
        honda.drive();
        honda.stop();
        System.out.println(honda);

        Car bmw = new BMW("X5", 2022, 60000, "Blue");
        bmw.start();
        bmw.drive();
        bmw.stop();
        System.out.println(bmw);

        Audi audi = new Audi("A6", 2023, 55000, "Silver");
        audi.start();
        audi.drive();
        audi.autoPark();
        audi.stop();
        System.out.println(audi);

        Mercedes mercedes = new Mercedes("S-Class", 2023, 70000, "Black");
        mercedes.start();
        mercedes.drive();
        mercedes.autoPark();
        mercedes.stop();
        System.out.println(mercedes);

        Tesla tesla = new Tesla("Model S", 2023, 80000, "Red");
        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();
        tesla.stop();
        System.out.println(tesla);

        Nio nio = new Nio("ES8", 2023, 90000, "White");
        nio.start();
        nio.drive();
        nio.autoPark();
        nio.selfDrive();
        nio.stop();
        System.out.println(nio);

        CydeoCar cydeoCar = new CydeoCar("CyCar", 2023, 120000, "Gold");
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        cydeoCar.stop();
        System.out.println(cydeoCar);
    }
}

