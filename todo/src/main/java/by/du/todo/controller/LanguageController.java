package by.du.todo.controller;

import by.du.todo.service.InputService;

import java.util.Locale;

import static by.du.todo.service.TranslateService.getString;

public class LanguageController {
    private final InputService inputService;

    public LanguageController(final InputService inputService) {
        this.inputService = inputService;
    }

    public void show() {
        while (true) {
            System.out.println(getString("selectLang"));
            System.out.println("1 - English");
            System.out.println("2 - Русский");
            System.out.println("0 - " + getString("exit"));
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 1:
                    Locale.setDefault(Locale.US);
                    break;
                case 2:
                    Locale.setDefault(Locale.forLanguageTag("ru-RU"));
                    break;
                case 0:
                    return;
                default:
            }
        }
    }
}
