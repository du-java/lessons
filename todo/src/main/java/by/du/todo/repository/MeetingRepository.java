package by.du.todo.repository;

import by.du.todo.model.Meeting;
import by.du.todo.service.FileService;

public class MeetingRepository extends AbstractRepository<Meeting> {
    public MeetingRepository(final FileService<Meeting> fileService) {
        super(fileService);
    }
}
