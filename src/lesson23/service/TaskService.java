package lesson23.service;

import lesson23.model.Task;
import lesson23.repository.TaskRepository;

public class TaskService extends AbstractService<Task> {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        super(taskRepository);
        this.taskRepository = taskRepository;
    }
}
