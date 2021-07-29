package lesson48.creational.abstract_factory;

public interface ToyotaFactory {

    Car blue();

    Car red();

    static ToyotaFactory getInstance(ModelType type) {
        switch (type) {
            case TUNDRA:
                return new TundraToyotaFactory();
            case COROLLA:
                return new CorollaToyotaFactory();
            default:
                throw new IllegalArgumentException();
        }
    }
}
