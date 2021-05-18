package lesson24.todo.repository;

import lesson24.todo.model.Meeting;
import lesson24.todo.service.FileService;

public class MeetingRepository extends AbstractRepository<Meeting> {
    public MeetingRepository(final FileService<Meeting> fileService) {
        super(fileService);
    }
}
