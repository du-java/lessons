package lesson12.animal;

public class AnimalFactory {
    public static Animal getInstance(int typeOfAnimal) {
        switch (typeOfAnimal) {
            case 1:
                return new Cat();
            case 2:
                return new Dog();
            default:
                throw new IllegalArgumentException("invalid argument");
        }
    }
}
