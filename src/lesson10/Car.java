package lesson10;

import lesson10.abstracts.Transport;

public class Car extends Transport {
    private int doorCount;
    private int power;
    private String name;

//    public Car() {
//    }

    public void carWheels() {
        printWheels();
    }

    public Car(int doorCount, int power, String name) {
        this.doorCount = doorCount;
        this.power = power;
        this.name = name;
    }

    private void constructor(int doorCount, int power, String name) {
        this.doorCount = doorCount;
        this.power = power;
        this.name = name;
    }

    public Car(int doorCount, int power, String name, int wheels) {
        this(doorCount, power, name);
//        Car tring = new Car(doorCount, doorCount, "tring");
        this.wheels = 4;
    }

    public Car(int doorCount1) {
        this.doorCount = doorCount1;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", power=" + power +
                ", name='" + name + '\'' +
                '}';
    }

    public void moveFaster() {
        System.out.println("move faster");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (doorCount != car.doorCount) return false;
        if (power != car.power) return false;
        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        int result = doorCount;
        result = 31 * result + power;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

}
