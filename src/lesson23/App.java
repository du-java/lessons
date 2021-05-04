package lesson23;

import lesson23.controller.*;
import lesson23.repository.MeetingRepository;
import lesson23.repository.TaskRepository;
import lesson23.service.*;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final InputService inputService = new InputService(scanner);
        final TaskController taskController = getTaskController(inputService);
        final MeetingController meetingController = getMeetingController(inputService);
        final HomeController homeController = new HomeController(inputService, meetingController, taskController);
        homeController.show();
    }

    private static TaskController getTaskController(InputService inputService) {
        TaskRepository taskRepository = new TaskRepository(new TaskFileService());
        taskRepository.load();
        return new TaskController(new TaskService(taskRepository), inputService);

    }

    private static MeetingController getMeetingController(final InputService inputService) {
        final MeetingRepository meetingRepository = new MeetingRepository(new MeetingFileService());
        meetingRepository.load();

        final FilteredMeetingController filteredMeetingController
                = new FilteredMeetingController(new MeetingService(meetingRepository), inputService);
        final EditMeetingController editMeetingController
                = new EditMeetingController(new MeetingService(meetingRepository), inputService);
        return new MeetingController(new MeetingService(meetingRepository), inputService,
                filteredMeetingController, editMeetingController);
    }
}
