package by.du;

public interface Dao<T> {

    T read(int id);
    void save(T t);

}
