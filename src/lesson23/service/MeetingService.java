package lesson23.service;

import lesson23.model.Meeting;
import lesson23.repository.MeetingRepository;
import lesson23.repository.Repository;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class MeetingService extends AbstractService<Meeting> {

    private final MeetingRepository meetingRepository;

    public MeetingService(MeetingRepository meetingRepository) {
        super(meetingRepository);
        this.meetingRepository = meetingRepository;
    }

    public List<Meeting> getAllMeetingsByDate(LocalDate localDate) {
        if (localDate == null) return Collections.emptyList();
        return meetingRepository.getAllBy(x -> {
            LocalDate start = x.getStart().toLocalDate();
            LocalDate end = x.getEnd().toLocalDate();
            return start.equals(localDate) ||
                    end.equals(localDate) ||
                    (start.isBefore(localDate) &&
                            end.isAfter(localDate));

        });

    }
}
