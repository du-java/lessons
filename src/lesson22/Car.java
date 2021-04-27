package lesson22;

public class Car {
    private int power;
    private String name;

    public Car() {
    }

    public Car(int power, String name) {
        this.power = power;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", name='" + name + '\'' +
                '}';
    }
}
