package lesson24.todo.repository;

import lesson24.todo.model.Task;
import lesson24.todo.service.FileService;

public class TaskRepository extends AbstractRepository<Task> {
    public TaskRepository(final FileService<Task> fileService) {
        super(fileService);
    }
}
