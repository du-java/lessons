package lesson23.service;

import lesson23.model.Event;
import lesson23.repository.Repository;

import java.util.List;

public abstract class AbstractService<T extends Event> implements Service<T> {

    private final Repository<T> repository;

    public AbstractService(final Repository<T> repository) {
        this.repository = repository;
    }

    @Override
    public T getById(final int id) {
        return repository.getById(id);
    }

    @Override
    public void add(final T t) {
        repository.add(t);
    }

    @Override
    public List<T> getAll() {
        return repository.getAll();
    }

    @Override
    public void save(final T t) {
        repository.save(t);
    }

    public void delete(int id){
        repository.delete(id);
    }
}
