package lesson23.service;

import lesson23.exception.StopException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputService {

    public static final String DATE_TIME_PATTERN = "yy-MM-dd H-mm";
    public static final String DATE_PATTERN = "yy-MM-dd";

    private final Scanner scanner;

    public InputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public LocalDateTime getLocalDateTime(String msg) {
        while (true) {
            try {
                System.out.printf(msg, DATE_TIME_PATTERN);
                final String text = scanner.nextLine();
                return LocalDateTime.parse(text, DateTimeFormatter.ofPattern(DATE_TIME_PATTERN));
            } catch (DateTimeParseException ex) {
                processingInvalidInput();
            }
        }
    }

    public String getLine(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    public int nextInt() {
        final int nextInt = scanner.nextInt();
        scanner.nextLine();
        return nextInt;
    }

    public LocalDate getLocalDate(String msg) {
        while (true) {
            try {
                System.out.printf(msg, DATE_PATTERN);
                final String text = scanner.nextLine();
                return LocalDate.parse(text, DateTimeFormatter.ofPattern(DATE_PATTERN));
            } catch (DateTimeParseException ex) {
                processingInvalidInput();
            }
        }
    }

    private void processingInvalidInput() {
        System.out.println("Invalid input");
        System.out.println("1 - Repeat input");
        System.out.println("0 - Stop");
        try {
            final int nextInt = scanner.nextInt();
            scanner.nextLine();
            if (nextInt == 0) {
                throw new StopException();
            }
        } catch (InputMismatchException ignored) {
        }
    }
}
