package by.du.exception;

public class DbException extends RuntimeException {
    public DbException(Throwable throwable) {
        super(throwable);
    }
}
