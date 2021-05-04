package lesson23.controller;

import lesson23.service.InputService;

public class HomeController implements Controller {

    private final InputService inputService;
    private final MeetingController meetingController;
    private final TaskController taskController;

    public HomeController(InputService inputService, MeetingController meetingController, TaskController taskController) {
        this.inputService = inputService;
        this.meetingController = meetingController;
        this.taskController = taskController;
    }

    public void show() {
        System.out.println("ToDo List Application");
        while (true) {
            System.out.println("1 - Meetings");
            System.out.println("2 - Tasks");
            System.out.println("0 - Exit");
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 0:
                    System.exit(0);
                case 1:
                    meetingController.show();
                    break;
                case 2:
                    taskController.show();
                    break;
            }
        }
    }
}
