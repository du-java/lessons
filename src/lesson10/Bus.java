package lesson10;

import lesson10.abstracts.Commute;

public class Bus extends Commute {
    public Bus() {
        this.wheels = 6;
    }

    @Override
    public void move() {
        System.out.println("move bus");
        System.out.println(wheels);
    }
}
