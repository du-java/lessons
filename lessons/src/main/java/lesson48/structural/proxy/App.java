package lesson48.structural.proxy;

public class App {
    public static void main(String[] args) {
        final ExpensiveObjectProxy proxy = new ExpensiveObjectProxy();
        final ExpensiveService expensiveService = new ExpensiveService();

        expensiveService.makeSomething(proxy);
        expensiveService.makeSomething(proxy);
    }
}
