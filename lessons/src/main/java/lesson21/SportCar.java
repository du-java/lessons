package lesson21;

public class SportCar extends Car {

    @Override
    public String get() {
        return super.get() + " | " + this.getClass().getName();
    }
}
