package pl.sda.academy.intermediate.basic.Basic6Polymorphism;

public class Motorbike implements Vehicle {

    private static final int MAX_SPEED = 300;
    private int speed = 0;

    public Motorbike() {
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void accelerate() {
        this.speed += 30;
        if (this.speed > MAX_SPEED) {
            System.out.println("Nie moge wiecej przyspieszyc");
        }

    }


}
