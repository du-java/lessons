package by.du;

import by.du.exception.NotFoundException;
import by.du.model.Meeting;
import by.du.repository.MeetingDao;
import by.du.service.MeetingService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        final MeetingDao meetingDao = new MeetingDao();
        final MeetingService meetingService = new MeetingService(meetingDao);

        meetingService.findAll();
        try {
            meetingService.findById(1);
        } catch (NotFoundException ex) {
            log.error("not found meeting[{}]", ex.getId());
        }
    }
}
