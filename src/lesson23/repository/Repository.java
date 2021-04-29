package lesson23.repository;

import lesson23.model.Event;

public interface Repository {
    Event getEventById(int id);
    void addEvent(Event event);
}
