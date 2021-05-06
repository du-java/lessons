package lesson24.todo.controller;

import lesson24.todo.service.InputService;

import static lesson24.todo.service.TranslateService.getString;

public class HomeController implements Controller {

    private final InputService inputService;
    private final MeetingController meetingController;
    private final TaskController taskController;

    public HomeController(
            final InputService inputService,
            final MeetingController meetingController,
            final TaskController taskController
    ) {
        this.inputService = inputService;
        this.meetingController = meetingController;
        this.taskController = taskController;
    }

    public void show() {
        System.out.println("ToDo List Application");
        while (true) {
            System.out.println("1 - Meetings");
            System.out.println("2 - Tasks");
            System.out.println("0 -" + getString("exit"));
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 1:
                    meetingController.show();
                    break;
                case 2:
                    taskController.show();
                    break;
                case 0:
                    return;
                default:
            }
        }
    }
}
