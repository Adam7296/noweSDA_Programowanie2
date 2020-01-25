package pl.sda.academy.intermediate.basic.Basic6Polymorphism;

public class Bicycle implements Vehicle {

    private static final int MAX_SPEED = 50;
    private int speed = 0;

    public Bicycle() {
    }

    @Builder


    public int getSpeed() {
        return speed;

    }

    @Override
    public void accelerate() {
        this.speed += 5;
        if (this.speed > MAX_SPEED) {
            System.out.println("Nie moge wiecej przyspieszyc");
        }
    }


}
