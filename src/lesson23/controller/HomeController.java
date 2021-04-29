package lesson23.controller;

import lesson23.service.InputService;

public class HomeController {

    private final InputService inputService;
    private final MeetingController meetingController;

    public HomeController(InputService inputService, MeetingController meetingController) {
        this.inputService = inputService;
        this.meetingController = meetingController;
    }

    public void show() {

        System.out.println("ToDo List Application");

        while (true) {
            System.out.println("1 - Meetings");
            System.out.println("0 - Exit");
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 0:
                    System.exit(0);
                case 1:
                    meetingController.show();
                    break;
            }
        }
    }
}
