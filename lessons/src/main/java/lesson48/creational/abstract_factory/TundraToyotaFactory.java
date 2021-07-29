package lesson48.creational.abstract_factory;

public class TundraToyotaFactory implements ToyotaFactory {
    @Override
    public Car blue() {
        return new Car("tundra", "blue");

    }

    @Override
    public Car red() {
        return new Car("tundra", "red");
    }
}
