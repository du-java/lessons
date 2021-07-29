package lesson48.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject instance;

    @Override
    public void process() {
        if (instance == null) {
            instance = new ExpensiveObjectImpl();
        }
        System.out.println("start transaction");
        instance.process();
        System.out.println("stop transaction");
    }
}
