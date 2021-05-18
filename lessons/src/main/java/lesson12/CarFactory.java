package lesson12;

public class CarFactory {
    public static Car getInstance(CarModel model) {
        switch (model) {
            case X3:
                return new Car("bmw", "x3", "grey", 250);
            case X5:
                return new Car("bmw", "x5", "red", 350);
            case X1:
                return new Car("bmw", "x1", "white", 150);
            default:
                throw new IllegalArgumentException("wrong model");
        }
    }

    enum CarModel {
        X1, X3, X5
    }
}
