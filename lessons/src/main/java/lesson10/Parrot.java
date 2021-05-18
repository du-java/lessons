package lesson10;

public class Parrot extends AbstractBird{

    @Override
    public void eat() {
        System.out.println("ест крупу ");
    }

    @Override
    public void fly() {
        System.out.println("летает по дому ");
    }
}
