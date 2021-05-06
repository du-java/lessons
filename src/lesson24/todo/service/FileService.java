package lesson24.todo.service;

import lesson24.todo.model.Event;

import java.util.List;

public interface FileService<T extends Event> {

    List<T> load();

    void store(List<T> list);

}
