package lesson23.repository;

import lesson23.model.Task;
import lesson23.service.FileService;

public class TaskRepository extends AbstractRepository<Task> {
    public TaskRepository(final FileService<Task> fileService) {
        super(fileService);
    }
}
