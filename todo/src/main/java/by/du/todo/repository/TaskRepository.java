package by.du.todo.repository;

import by.du.todo.model.Task;
import by.du.todo.service.FileService;

public class TaskRepository extends AbstractRepository<Task> {
    public TaskRepository(final FileService<Task> fileService) {
        super(fileService);
    }
}
