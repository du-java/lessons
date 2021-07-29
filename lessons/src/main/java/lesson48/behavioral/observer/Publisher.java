package lesson48.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribes(Event event) {
        subscribers.forEach(x -> x.update(event));
    }
}
