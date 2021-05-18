package lesson17;

public class Car implements Comparable<Car>{
    private String name;
    private int doors;
    private int power;
    private int wheels;

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public int getPower() {
        return power;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (doors != car.doors) return false;
        if (power != car.power) return false;
        if (wheels != car.wheels) return false;
        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + doors;
        result = 31 * result + power;
        result = 31 * result + wheels;
        return result;
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.name);
    }
}
