package pl.sda.academy.intermediate.basic.Basic6Polymorphism;

public class Basic6Polymorphism {
    int times;

    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike();
        Bicycle bicycle = new Bicycle();
        Rocket rocket = new Rocket();
        System.out.println();
        motorbike.getSpeed();

//        Book.builder()
//                .author("sada")
//                .title("sdas")
//                .build()


    }

    public static int moveNTimesFast(Vehicle vehicle, int times) {
        System.out.println(times * vehicle.getSpeed());
        return times;
    }
}
