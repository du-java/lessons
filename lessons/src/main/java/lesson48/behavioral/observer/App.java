package lesson48.behavioral.observer;

public class App {
    public static void main(String[] args) {
        final Publisher publisher = new Publisher();

        publisher.subscribe(new DbSubscriber());
        publisher.subscribe(new DbSubscriber());
        publisher.subscribe(new FileSubscriber());
        publisher.subscribe(new FileSubscriber());

        publisher.notifyAllSubscribes(new Event("test"));
    }
}
