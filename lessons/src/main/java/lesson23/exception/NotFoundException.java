package lesson23.exception;

public class NotFoundException extends RuntimeException {
    private String message;
    private int id;

    public NotFoundException( int id) {
        this.id = id;
    }
}
