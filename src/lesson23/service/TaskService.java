package lesson23.service;

import lesson23.model.Task;
import lesson23.repository.TaskRepository;

import java.util.List;

public class TaskService extends AbstractService<Task> {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        super(taskRepository);
        this.taskRepository = taskRepository;
    }



    public List<Task> getAllNotCompleted() {
        return taskRepository.getAllBy(x -> !x.isCompleted());
    }

    public List<Task> getAllCompleted() {
        return taskRepository.getAllBy(x -> x.isCompleted());
    }

}
