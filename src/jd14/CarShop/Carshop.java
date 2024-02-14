package jd14.CarShop;

import jd14.Car.Audi;
import jd14.Car.Car;
import jd14.Car.Honda;
import jd14.Car.Tesla;

import java.util.ArrayList;

public class Carshop {

    public class CarShop {
        public static void main(String[] args) {
            Car[] cars = {
//                    new Honda("Civic", 2020, 20000, "Red"),
//                   // new Audi("Q6", "Red",2014, 32000),
//                  //  new Honda("Accord", "White",2011, 20000  ),
//                  //  new Audi("Q4", "Blue", 2015, 33000),
//                    new Audi("A7", "Black",2019, 35000),
//                    new Audi("Q8", "White",2018, 40000),
//                    new Audi("Q5", "Purple",2009, 30000),
//                    new Audi("A4", "Black", 2011, 30000),
//                    new Honda("Civic", "Red",2018, 30000),
//                    new Honda("CR-V", "Red", 2012, 23000),
//                    new Honda("HR-V", "Blue",2019, 35000),
//                    new Tesla("Model 3", 2021, 40000, "white"),
//                    new Tesla("Model Y", 2022, 45000, "black"),
//                    new Tesla("Model X", 2020, 50000, "blue"),
//                    new Tesla("Model X", 2021,55000, "pink"),
            };

            System.out.println("Cars eligible for recall:");
            for (Car car : cars) {
                if (car instanceof Honda && (car.getYear() >= 2010 && car.getYear() <= 2011)) {
                    System.out.println(car);
                } else if (car instanceof Audi && (car.getYear() >= 2015 && car.getYear() <= 2019)) {
                    System.out.println(car);
                } else if (car instanceof Tesla && (car.getYear() >= 2015 && car.getYear() <= 2016)) {
                    System.out.println(car);
                }
            }

            Car highestPriceCar = cars[0];
            for (int i = 1; i < cars.length; i++) {
                if (cars[i].getPrice() > highestPriceCar.getPrice()) {
                    highestPriceCar = cars[i];
                }
            }
            System.out.println("Car with the highest price:\n" + highestPriceCar);


            Car lowestPriceCar = cars[0];
            for (int i = 1; i < cars.length; i++) {
                if (cars[i].getPrice() < lowestPriceCar.getPrice()) {
                    lowestPriceCar = cars[i];
                }
            }
            System.out.println("Car with the lowest price:\n" + lowestPriceCar);

            // 1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array
            ArrayList<Tesla> teslaCars = new ArrayList<>();
            for (Car car : cars) {
                if (car instanceof Tesla) {
                    teslaCars.add((Tesla) car);
                }
            }
            System.out.println("Tesla cars:");
            for (Tesla tesla : teslaCars) {
                System.out.println(tesla);
            }
        }
}}
