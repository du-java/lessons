package lesson24.todo.exception;

public class NotFoundException extends RuntimeException {
    private String message;
    private int id;

    public NotFoundException( int id) {
        this.id = id;
    }
}
