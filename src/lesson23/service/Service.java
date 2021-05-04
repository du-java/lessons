package lesson23.service;

import lesson23.model.Event;

import java.util.List;

public interface Service<T extends Event> {
    T getById(int id);

    void add(T t);

    List<T> getAll();

    void save(T t);
}
