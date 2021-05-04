package lesson23.repository;

import lesson23.model.Meeting;
import lesson23.service.FileService;

public class MeetingRepository extends AbstractRepository<Meeting> {
    public MeetingRepository(final FileService<Meeting> fileService) {
        super(fileService);
    }
}
