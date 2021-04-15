package lesson19;

public class Car {
    private int power;
    private String name;
    private int doors;

    public Car(int power, String name, int doors) {
        this.power = power;
        this.name = name;
        this.doors = doors;
    }


    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", doors=" + doors +
                '}';
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }
}
