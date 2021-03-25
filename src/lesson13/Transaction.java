package lesson13;

public interface Transaction<T extends Account> {
    void execute();
}
