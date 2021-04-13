package lesson18;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {
    private int power;
    private String name;
    private List<Tyre> tyres;
    private transient String secret;

    public Car(int power, String name, List<Tyre> tyres, String secret) {
        this.power = power;
        this.name = name;
        this.tyres = tyres;
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", tyres=" + tyres +
                ", secret='" + secret + '\'' +
                '}';
    }
}
