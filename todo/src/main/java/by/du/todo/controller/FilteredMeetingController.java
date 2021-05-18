package by.du.todo.controller;

import by.du.todo.exception.StopException;
import by.du.todo.model.Meeting;
import by.du.todo.service.InputService;
import by.du.todo.service.MeetingService;
import by.du.todo.service.TranslateService;

import java.time.LocalDate;
import java.util.List;

public class FilteredMeetingController implements Controller {

    private final InputService inputService;
    private final MeetingService meetingService;

    public FilteredMeetingController(final MeetingService meetingService, final InputService inputService) {
        this.inputService = inputService;
        this.meetingService = meetingService;
    }

    public void show() {
        while (true) {
            System.out.println(TranslateService.getString("showFilteredMeeting"));
            System.out.println("1 - " + TranslateService.getString("byDate"));
            System.out.println("2 - " + TranslateService.getString("betweenDate"));
            System.out.println("3 - " + TranslateService.getString("byPlace"));
            System.out.println("0 - " + TranslateService.getString("return"));
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 1:
                    showAllByDate();
                    break;
                case 2:
                    showAllBetween();
                    break;
                case 3:
                    showAllByPlace();
                    break;
                case 0:
                    return;
                default:
            }
        }
    }

    private void showAllBetween() {
        System.out.println("Show filtered meetings between dates");
        final List<Meeting> allBetween;
        try {
            final LocalDate from = inputService.getLocalDate("Input date (%s) from: ");
            final LocalDate to = inputService.getLocalDate("Input date (%s) to: ");
            allBetween = meetingService.getAllBetween(from, to);
        } catch (StopException ex) {
            return;
        }
        allBetween.forEach(System.out::println);
        System.out.println();
    }

    private void showAllByDate() {
        System.out.println("Show filtered meetings by Date");
        final List<Meeting> allMeetingsByDate;
        try {
            LocalDate date = inputService.getLocalDate("Input Date (%s): ");
            allMeetingsByDate = meetingService.getAllMeetingsByDate(date);
        } catch (StopException ex) {
            return;
        }
        allMeetingsByDate.forEach(System.out::println);
        System.out.println();
    }

    private void showAllByPlace() {
        System.out.println("Show filtered meetings by Place");
        final List<Meeting> list;
        try {
            final String place = inputService.getLine("Input Place (%s): ");
            list = meetingService.getAllMeetingsByPlace(place);
        } catch (StopException ex) {
            return;
        }
        list.forEach(System.out::println);
        System.out.println();
    }
}
