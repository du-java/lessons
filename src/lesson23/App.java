package lesson23;

import lesson23.controller.HomeController;
import lesson23.controller.MeetingController;
import lesson23.controller.TaskController;
import lesson23.repository.MeetingRepository;
import lesson23.repository.TaskRepository;
import lesson23.service.InputService;
import lesson23.service.MeetingService;
import lesson23.service.TaskService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final InputService inputService = new InputService(scanner);
        final TaskController taskController = new TaskController(new TaskService(new TaskRepository()), inputService);
        final MeetingController meetingController = new MeetingController(new MeetingService(new MeetingRepository()), inputService);
        final HomeController homeController = new HomeController(inputService, meetingController, taskController);
        homeController.show();
    }
}
