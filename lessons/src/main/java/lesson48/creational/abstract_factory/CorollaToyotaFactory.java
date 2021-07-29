package lesson48.creational.abstract_factory;

public class CorollaToyotaFactory implements ToyotaFactory{
    @Override
    public Car blue() {
        return new Car("corolla", "blue");
    }

    @Override
    public Car red() {
        return new Car("corolla", "red");
    }
}
