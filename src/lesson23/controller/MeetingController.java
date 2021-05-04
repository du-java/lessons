package lesson23.controller;

import lesson23.exception.StopException;
import lesson23.model.Meeting;
import lesson23.service.InputService;
import lesson23.service.MeetingService;

import java.time.LocalDateTime;

public class MeetingController {

    private final InputService inputService;
    private final MeetingService meetingService;
    private final FilteredMeetingController filteredMeetingController;
    private final EditMeetingController editMeetingController;

    public MeetingController(
            final MeetingService meetingService,
            final InputService inputService,
            final FilteredMeetingController filteredMeetingController,
            final EditMeetingController editMeetingController) {
        this.inputService = inputService;
        this.meetingService = meetingService;
        this.filteredMeetingController = filteredMeetingController;
        this.editMeetingController = editMeetingController;
    }

    public void show() {
        while (true) {
            System.out.println("Meetings");
            System.out.println("1 - Add meeting");
            System.out.println("2 - Show all meetings");
            System.out.println("3 - Show filtered meetings");
            System.out.println("4 - Edit meeting");
//            System.out.println("5 - Delete meeting");
            System.out.println("0 - Return");
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    filteredMeetingController.show();
                    break;
                case 4:
                    editMeetingController.show();
                    break;
                case 0:
                    return;
                default:
            }
        }
    }

    public void add() {
        System.out.println("Adding a new Meeting");
        final String place = inputService.getLine("Input Place: ");
        LocalDateTime start;
        LocalDateTime end;
        try {
            start = inputService.getLocalDateTime("Input Start date and time (%s): ");
            end = inputService.getLocalDateTime("Input End date and time (%s): ");
        } catch (StopException ex) {
            return;
        }
        final String desc = inputService.getLine("Input Description: ");
        meetingService.add(new Meeting(place, start, end, desc));
        System.out.println("\nNew Meeting was added successfully\n");
    }

    public void showAll() {
        System.out.println("Showing all meetings");
        meetingService.getAll().forEach(System.out::println);
        System.out.println();
    }
}
