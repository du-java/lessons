package lesson23.repository;

import lesson23.model.Event;

import java.util.List;
import java.util.function.Predicate;

public interface Repository<T extends Event> {
    T getById(int id);

    void add(T t);

    List<T> getAll();

    List<T> getAllBy(Predicate<T> predicate);

    void save(T t);
}
