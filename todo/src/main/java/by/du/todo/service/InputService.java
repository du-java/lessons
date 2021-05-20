package by.du.todo.service;

import by.du.todo.exception.StopException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputService {

    private static final String DATE_TIME_PATTERN = "yy-MM-dd H-mm";
    private static final String DATE_PATTERN = "yy-MM-dd";

    private final Scanner scanner;

    public InputService(final Scanner scanner) {
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

    public String getLine(final String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    public int nextInt() {
        while (true) {
            try {
                final int nextInt = scanner.nextInt();
                scanner.nextLine();
                return nextInt;
            } catch (InputMismatchException ex) {
                System.out.println();
                scanner.nextLine();
            }
        }
    }

    public int nextInt(final String msg) {
        System.out.println(msg);
        return nextInt();
    }

    public LocalDate getLocalDate(final String msg) {
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
        System.out.println(TranslateService.getString("invalidInput"));
        System.out.println(TranslateService.getString("repeat"));
        System.out.println(TranslateService.getString("stop"));
        try {
            final int nextInt = scanner.nextInt();
            scanner.nextLine();
            if (nextInt == 0) {
                throw new StopException();
            }
        } catch (InputMismatchException ignored) {
            System.out.println();
        }
    }
}
