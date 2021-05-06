package lesson24.todo.controller;

import lesson24.todo.model.Meeting;
import lesson24.todo.service.InputService;
import lesson24.todo.service.MeetingService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static lesson24.todo.service.TranslateService.getString;

public class EditMeetingController implements Controller {

    private static final String DATE_TIME_PATTERN = "yy-MM-dd H-mm";

    private final InputService inputService;
    private final MeetingService meetingService;

    public EditMeetingController(final MeetingService meetingService, final InputService inputService) {
        this.inputService = inputService;
        this.meetingService = meetingService;
    }

    public void show() {
        final int id = inputService.nextInt(         getString("inputId"));
        final Meeting meeting = meetingService.getById(id);
        final String newPlace = inputService.getLine(getString("inputPlace"));
        final String newStart = inputService.getLine(getString("inputStart"));
        final String newEnd = inputService.getLine(  getString("inputDate"));
        final String newDesc = inputService.getLine( getString("inputDesc"));

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
