package lesson23.service;

import lesson23.model.Meeting;

import java.time.LocalDateTime;
import java.util.function.Function;

public class MeetingFileService extends AbstractFileService<Meeting> {

    public MeetingFileService(final String path) {
        super(path, getParse());
    }

    private static Function<String, Meeting> getParse() {
        return line -> {
            final String[] strings = line.split(",");
            final Meeting meeting = new Meeting();
            meeting.setId(Integer.parseInt(strings[0]));
            meeting.setPlace(strings[1]);
            meeting.setStart(LocalDateTime.parse(strings[2]));
            meeting.setEnd(LocalDateTime.parse(strings[3]));
            meeting.setDesc(strings[4]);
            return meeting;
        };
    }
}
