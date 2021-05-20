package lesson10.transport;

import lesson10.transport.abstracts.Commute;

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
