package lesson23.repository;

import lesson23.exception.NotFoundException;
import lesson23.model.Event;
import lesson23.service.FileService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class AbstractRepository<T extends Event> implements Repository<T> {

    private int currentId = 0;

    private final List<T> meetingList = new ArrayList<>();
    private final FileService<T> fileService;

    protected AbstractRepository(final FileService<T> fileService) {
        this.fileService = fileService;
    }

    @Override
    public T getById(final int id) {
        return meetingList.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public void add(final T t) {
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
    public List<T> getAllBy(final Predicate<T> predicate) {
        if (predicate == null) {
            return Collections.emptyList();
        }
        return meetingList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    @Override
    public void save(final T t) {
        final int id = t.getId();
        final int idx = getIdx(id);
        meetingList.add(idx, t);
    }

    @Override
    public void delete(final int id) {
        meetingList.remove(getIdx(id));
    }

    public void load() {
        meetingList.addAll(fileService.load());
    }

    public void store() {
        fileService.store(meetingList);
    }

    private int getIdx(final int id) {
        final T prev = getById(id);
        return meetingList.indexOf(prev);
    }
}
