package lesson48.behavioral.observer;

public class FileSubscriber implements Subscriber {
    @Override
    public void update(Event event) {
        System.out.println("Save Event [" + event + "] to file");
    }
}
