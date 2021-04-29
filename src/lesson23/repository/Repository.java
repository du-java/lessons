package lesson23.repository;

import lesson23.model.Event;

public interface Repository {
    Event getById(int id);
    void add(Event event);
}
