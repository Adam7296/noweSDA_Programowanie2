package pl.sda.academy.intermediate.basic.Basic4Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car car2 = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car car3 = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car car4 = new Car("Audi", "A3", "1FMFU17538LA84228");
        Car car5 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car car6 = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080");

        HashSet<Car> carHashSet = new HashSet<>();
        carHashSet.add(car1);
        carHashSet.add(car2);
        carHashSet.add(car3);
        carHashSet.add(car4);
        carHashSet.add(car5);
        carHashSet.add(car6);

//        System.out.println("Wszystkie samochody \n" + carHashSet);
        System.out.println("================================================================");

        for (Car car : carHashSet) {
            System.out.println(car);

            LinkedHashSet<Car> carLinkedHashSet = new LinkedHashSet<>();
            carLinkedHashSet.add(car1);
            carLinkedHashSet.add(car2);
            carLinkedHashSet.add(car3);
            carLinkedHashSet.add(car4);
            carLinkedHashSet.add(car5);
            carLinkedHashSet.add(car6);
//            System.out.println(carLinkedHashSet);
            System.out.println("============================================================");

            for (Car ddd : carLinkedHashSet) {
                System.out.println(ddd);

            }
        }


    }


}


