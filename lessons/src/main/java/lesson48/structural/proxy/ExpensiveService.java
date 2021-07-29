package lesson48.structural.proxy;

public class ExpensiveService {

    public void makeSomething(ExpensiveObject object) {
        object.process();
    }
}
