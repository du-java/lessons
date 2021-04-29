package lesson23.controller;

import lesson23.exception.StopException;
import lesson23.model.Meeting;
import lesson23.service.InputService;
import lesson23.service.MeetingService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MeetingController {

    private final InputService inputService;
    private final MeetingService meetingService;

    public MeetingController(MeetingService meetingService, InputService inputService) {
        this.inputService = inputService;
        this.meetingService = meetingService;
    }

    public void show() {
        while (true) {
            System.out.println("Meetings");
            System.out.println("1 - Add meeting");
            System.out.println("2 - Show all meetings");
            System.out.println("3 - Show filtered meetings");
            System.out.println("4 - Edit meeting");
            System.out.println("5 - Delete meeting");
            System.out.println("0 - Return");
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 0:
                    return;
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
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

    public void filtered() {
        while (true) {
            System.out.println("Show filtered meetings");
            System.out.println("1 - by Date");
            System.out.println("2 - between DateTime");
            System.out.println("3 - by place");
            System.out.println("0 - Return");
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 0:
                    return;
                case 1:
                    showAllByDate();
                    break;
                case 2:
                    showAll();
            }
        }
    }

    private void showAllByDate() {
        System.out.println("Show filtered meetings by Date");
        List<Meeting> allMeetingsByDate;
        try {
            LocalDate date = inputService.getLocalDate("Input Date (%s): ");
            allMeetingsByDate = meetingService.getAllMeetingsByDate(date);
        } catch (StopException ex) {
            return;
        }
        allMeetingsByDate.forEach(System.out::println);
        System.out.println();
    }
}
