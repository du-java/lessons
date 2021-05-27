package by.du.repository;

import by.du.model.Event;

import java.util.List;
import java.util.Optional;

public interface Dao<T extends Event> {

    Optional<T> findById(int id);

    List<T> findAll();

}
