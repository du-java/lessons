package lesson23.service;

import lesson23.model.Meeting;
import lesson23.model.Task;

import java.time.LocalDateTime;
import java.util.function.Function;

public class TaskFileService extends AbstractFileService<Task> {

    public TaskFileService() {
        super("task.db", getParse());
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
