package lesson23.service;

import lesson23.model.Event;

import java.util.List;

public interface FileService<T extends Event> {

    List<T> load();

    void store(List<T> list);

}
