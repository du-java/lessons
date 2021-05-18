package by.du.todo.controller;

import by.du.todo.service.InputService;

import static by.du.todo.service.TranslateService.getString;

public class HomeController implements Controller {

    private final InputService inputService;
    private final MeetingController meetingController;
    private final TaskController taskController;
    private final LanguageController languageController;

    public HomeController(
            final InputService inputService,
            final MeetingController meetingController,
            final TaskController taskController,
            final LanguageController languageController) {
        this.inputService = inputService;
        this.meetingController = meetingController;
        this.taskController = taskController;
        this.languageController = languageController;
    }

    public void show() {
        System.out.println("ToDo List Application");
        while (true) {
            System.out.println("1 - Meetings");
            System.out.println("2 - Tasks");
            System.out.println("9 - " + getString("changeLang"));
            System.out.println("0 - " + getString("exit"));
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 1:
                    meetingController.show();
                    break;
                case 2:
                    taskController.show();
                    break;
                case 9:
                    languageController.show();
                    break;
                case 0:
                    return;
                default:
            }
        }
    }
}
