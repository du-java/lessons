package lesson23.service;

import lesson23.model.Event;
import lesson23.repository.Repository;

import java.util.List;

public abstract class AbstractService<T extends Event> implements Service<T> {

    private final Repository<T> repository;

    public AbstractService(Repository<T> repository) {
        this.repository = repository;
    }

    @Override
    public T getById(int id) {
        return repository.getById(id);
    }

    @Override
    public void add(T t) {
        repository.add(t);
    }

    @Override
    public List<T> getAll() {
        return repository.getAll();
    }
}
