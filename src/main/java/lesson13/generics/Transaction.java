package lesson13.generics;

public interface Transaction<T extends Account> {
    void execute();
}
