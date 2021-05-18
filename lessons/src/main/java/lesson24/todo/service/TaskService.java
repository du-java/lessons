package lesson24.todo.service;

import lesson24.todo.model.Task;
import lesson24.todo.repository.TaskRepository;

import java.util.List;

public class TaskService extends AbstractService<Task> {

    private final TaskRepository taskRepository;

    public TaskService(final TaskRepository taskRepository) {
        super(taskRepository);
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllNotCompleted() {
        return taskRepository.getAllBy(x -> !x.isCompleted());
    }

    public List<Task> getAllCompleted() {
        return taskRepository.getAllBy(Task::isCompleted);
    }

}
