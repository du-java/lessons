package lesson23;

import lesson23.controller.*;
import lesson23.repository.MeetingRepository;
import lesson23.repository.TaskRepository;
import lesson23.service.InputService;
import lesson23.service.MeetingService;
import lesson23.service.TaskService;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final InputService inputService = new InputService(scanner);
        final TaskController taskController = new TaskController(new TaskService(new TaskRepository()), inputService);
        final MeetingController meetingController = getMeetingController(inputService);
        final HomeController homeController = new HomeController(inputService, meetingController, taskController);
        homeController.show();
    }

    private static MeetingController getMeetingController(final InputService inputService) {
        final FilteredMeetingController filteredMeetingController
                = new FilteredMeetingController(new MeetingService(new MeetingRepository()), inputService);
        final EditMeetingController editMeetingController
                = new EditMeetingController(new MeetingService(new MeetingRepository()), inputService);
        return new MeetingController(new MeetingService(new MeetingRepository()), inputService,
                filteredMeetingController, editMeetingController);
    }
}
