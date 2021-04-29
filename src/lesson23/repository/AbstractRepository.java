package lesson23.repository;

import lesson23.exception.NotFoundException;
import lesson23.model.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AbstractRepository<T extends Event> implements Repository<T> {

    private int currentId = 0;

    private final List<T> meetingList = new ArrayList<>();

    @Override
    public T getById(int id) {
        return meetingList.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public void add(T t) {
        if (t == null) {
            return;
        }
        t.setId(++currentId);
        meetingList.add(t);
    }

    @Override
    public List<T> getAll() {
        return meetingList;
    }

    @Override
    public List<T> getAllBy(Predicate<T> predicate) {
        if (predicate == null) return Collections.emptyList();
        return meetingList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
