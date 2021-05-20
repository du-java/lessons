package lesson10;

public class Parrot extends AbstractBird {

    @Override
    public void eat() {
        System.out.println("eat krupu ");
    }

    @Override
    public void fly() {
        System.out.println("летает по дому ");
    }
}
