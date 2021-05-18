package lesson23.controller;

import lesson23.model.Meeting;
import lesson23.service.InputService;
import lesson23.service.MeetingService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EditMeetingController implements Controller {

    private static final String DATE_TIME_PATTERN = "yy-MM-dd H-mm";

    private final InputService inputService;
    private final MeetingService meetingService;

    public EditMeetingController(final MeetingService meetingService, final InputService inputService) {
        this.inputService = inputService;
        this.meetingService = meetingService;
    }

    public void show() {
        final int id = inputService.nextInt("Input meeting id");
        final Meeting meeting = meetingService.getById(id);
        final String newPlace = inputService.getLine("Input new Place or press Enter to skip");
        final String newStart = inputService.getLine("Input new Start Date and Time or press Enter to skip");
        final String newEnd = inputService.getLine("Input new End Date and Time or press Enter to skip");
        final String newDesc = inputService.getLine("Input new Description or press Enter to skip");

        if (newPlace != null && !newPlace.isEmpty()) {
            meeting.setPlace(newPlace);
        }
        if (newDesc != null && !newDesc.isEmpty()) {
            meeting.setDesc(newDesc);
        }
        final LocalDateTime start = parseLocalDate(newStart);
        if (start != null) {
            meeting.setStart(start);
        }
        final LocalDateTime end = parseLocalDate(newEnd);
        if (end != null) {
            meeting.setEnd(end);
        }

        meetingService.save(meeting);
    }

    private LocalDateTime parseLocalDate(final String line) {
        if (line == null || line.isEmpty()) {
            return null;
        }
        try {
            return LocalDateTime.parse(line, DateTimeFormatter.ofPattern(DATE_TIME_PATTERN));
        } catch (DateTimeParseException ex) {
            return null;
        }
    }
}
