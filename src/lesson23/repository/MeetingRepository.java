package lesson23.repository;

import lesson23.exception.NotFoundException;
import lesson23.model.Event;
import lesson23.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class MeetingRepository implements Repository {

    private final List<Meeting> meetingList = new ArrayList<>();

    @Override
    public Meeting getById(int id) {
        return meetingList.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public void add(Event event) {
        if (event == null) {
            return;
        }
        Meeting meeting = (Meeting) event;
        meeting.setId(meetingList.size());
        meetingList.add(meeting);
    }
}
