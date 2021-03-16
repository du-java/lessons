package lesson10.abstracts;

public abstract class Transport implements Movable {

    protected int wheels;

    public void move() {
        System.out.println("move transport");
    }

    protected void printWheels() {
        System.out.println(wheels);
    }
}
