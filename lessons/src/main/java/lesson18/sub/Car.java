package lesson18.sub;

import lesson18.Tyre;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {
    private int power;
    private String name;
    private List<Tyre> tyres;

    public Car(int power, String name, List<Tyre> tyres) {
        this.power = power;
        this.name = name;
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", tyres=" + tyres +
                '}';
    }
}
