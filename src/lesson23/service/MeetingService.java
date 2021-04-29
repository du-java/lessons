package lesson23.service;

import lesson23.model.Meeting;
import lesson23.repository.Repository;

import java.time.LocalDate;
import java.util.List;

public class MeetingService extends AbstractService<Meeting> {

    public MeetingService(Repository<Meeting> repository) {
        super(repository);
    }

    public List<Meeting> getAllMeetingsByDate(LocalDate localDate) {
        return null;
    }
}
