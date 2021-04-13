package lesson18;

import java.io.Serializable;

public class Tyre implements Serializable {
    private String name;

    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    private int size;
}
