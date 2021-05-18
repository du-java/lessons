package by.du.todo.service;

import by.du.todo.model.Task;

import java.util.function.Function;

public class TaskFileService extends AbstractFileService<Task> {

    public TaskFileService(final String path) {
        super(path, getParse());
    }

    private static Function<String, Task> getParse() {
        return line -> {
            final String[] strings = line.split(",");
            final Task task = new Task();
            task.setId(Integer.parseInt(strings[0]));
            task.setDesc(strings[1]);
            task.setCompleted(Boolean.parseBoolean(strings[2]));
            return task;
        };
    }
}
