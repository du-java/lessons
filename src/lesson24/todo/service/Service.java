package lesson24.todo.service;

import lesson24.todo.model.Event;

import java.util.List;

public interface Service<T extends Event> {
    T getById(int id);

    void add(T t);

    List<T> getAll();

    void save(T t);

    void delete(int id);


}
