package lesson24.todo.service;

import lesson24.todo.model.Meeting;
import lesson24.todo.repository.MeetingRepository;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class MeetingService extends AbstractService<Meeting> {

    private final MeetingRepository meetingRepository;

    public MeetingService(final MeetingRepository meetingRepository) {
        super(meetingRepository);
        this.meetingRepository = meetingRepository;
    }

    public List<Meeting> getAllMeetingsByDate(final LocalDate localDate) {
        if (localDate == null) {
            return Collections.emptyList();
        }
        return meetingRepository.getAllBy(x -> {
            LocalDate start = x.getStart().toLocalDate();
            LocalDate end = x.getEnd().toLocalDate();
            return start.equals(localDate) || end.equals(localDate)
                    || (start.isBefore(localDate) && end.isAfter(localDate));
        });
    }

    public List<Meeting> getAllBetween(final LocalDate from, final LocalDate to) {
        if (from == null || to == null) {
            return Collections.emptyList();
        }
        return meetingRepository.getAllBy(x -> {
            LocalDate start = x.getStart().toLocalDate();
            LocalDate end = x.getEnd().toLocalDate();
            return start.isAfter(from) && end.isBefore(to);
        });
    }

    public List<Meeting> getAllMeetingsByPlace(final String place) {
        if (place == null || place.isEmpty()) {
            return Collections.emptyList();
        }
        return meetingRepository.getAllBy(x -> x.getPlace().equals(place));
    }
}
