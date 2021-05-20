package lesson10;

public class Eagle extends AbstractBird {
    @Override
    public void eat() {
        System.out.println("eat meat ");
    }

    @Override
    public void fly() {
        System.out.println("летает в горах ");
    }
}
