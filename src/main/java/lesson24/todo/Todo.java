package lesson24.todo;

import lesson23.App;
import lesson24.todo.controller.*;
import lesson24.todo.repository.MeetingRepository;
import lesson24.todo.repository.TaskRepository;
import lesson24.todo.service.*;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class Todo {

    private static Properties PROPERTIES;

    public static void main(final String[] args) {
        loadProps();

        setDefaultLocale();

        final Scanner scanner = new Scanner(System.in);
        final InputService inputService = new InputService(scanner);
        final TaskController taskController = getTaskController(inputService);
        final MeetingController meetingController = getMeetingController(inputService);
        final LanguageController languageController = new LanguageController(inputService);
        final HomeController homeController = new HomeController(inputService, meetingController, taskController, languageController);
        homeController.show();
    }

    private static void setDefaultLocale() {
        Locale.setDefault(Locale.forLanguageTag(getProperties("default-locale")));
    }

    private static void loadProps() {
        try {
            PROPERTIES = new Properties();
            PROPERTIES.load(App.class.getClassLoader().getResourceAsStream("app_todo.properties"));
        } catch (IOException ex) {
            System.err.println("Can start App");
            System.exit(0);
        }
    }

    private static TaskController getTaskController(final InputService inputService) {
        TaskRepository taskRepository = new TaskRepository(new TaskFileService(getProperties("task-db")));
        taskRepository.load();
        return new TaskController(new TaskService(taskRepository), inputService);

    }

    private static MeetingController getMeetingController(final InputService inputService) {
        final MeetingRepository meetingRepository = new MeetingRepository(new MeetingFileService(getProperties("meeting-db")));
        meetingRepository.load();

        final FilteredMeetingController filteredMeetingController
                = new FilteredMeetingController(new MeetingService(meetingRepository), inputService);
        final EditMeetingController editMeetingController
                = new EditMeetingController(new MeetingService(meetingRepository), inputService);
        return new MeetingController(new MeetingService(meetingRepository), inputService,
                filteredMeetingController, editMeetingController);
    }

    private static String getProperties(final String key) {
        return PROPERTIES.getProperty(key);
    }
}
