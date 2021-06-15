package by.du;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class Service {

    private final Dao<Object> dao;

    public Object read(int id) {
        return dao.read(id);
    }

    public void save(Object o) {
        dao.save(o);
    }

    public Object readTwice(int id) {
        try {
            dao.read(id);
            return dao.read(id);
        } catch (IllegalArgumentException ex) {
            throw new IllegalStateException();
        }
    }

    @SneakyThrows
    public void read() {
        Thread.sleep(2500);
    }
}
