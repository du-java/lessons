package lesson23.repository;

import lesson23.exception.NotFoundException;
import lesson23.model.Event;
import lesson23.model.Meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MeetingRepository implements Repository<Meeting> {

    private int currentId = 0;

    private final List<Meeting> meetingList = new ArrayList<>();

    @Override
    public Meeting getById(int id) {
        return meetingList.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public void add(Meeting meeting) {
        if (meeting == null) {
            return;
        }
        meeting.setId(++currentId);
        meetingList.add(meeting);
    }

    @Override
    public List<Meeting> getAll() {
        return meetingList;
    }

    @Override
    public List<Meeting> getAllBy(Predicate<Meeting> predicate) {
        if(predicate == null) return Collections.emptyList();
        return meetingList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
