package by.du.service;

import by.du.model.Event;

import java.util.List;

public interface Service<T extends Event> {

    T findById(int id);

    List<T> findAll();

}
