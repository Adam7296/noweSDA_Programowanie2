package pl.sda.academy.intermediate.basic.Basic6Polymorphism;

public class Rocket implements Vehicle {

    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    public Rocket() {
    }


    @Override
    public int getSpeed() {
        return speed;

    }

    @Override
    public void accelerate() {
        this.speed += 1000;
        if (this.speed > MAX_SPEED) {
            System.out.println("Nie moge wiecej przyspieszyc");
        }

    }
}
