package lesson23.repository;

import lesson23.model.Event;
import lesson23.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class MeetingRepository implements Repository {

    private final List<Meeting> meetingList = new ArrayList<>();

    @Override
    public Event getEventById(int id) {
        return null;
    }

    @Override
    public void addEvent(Event event) {

    }
}
