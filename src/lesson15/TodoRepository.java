package lesson15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TodoRepository {

    private Map<ToDoType, List<Todo>> map = new HashMap<>();
    private static final Logger logger = Logger.getLogger(TodoRepository.class.getName());

    public List<Todo> getTodos(ToDoType type) {
        return getTodos(type.name());
    }

    public List<Todo> getTodos(String type) {
        try {
            List<Todo> todos = this.map.get(ToDoType.valueOf(type.toUpperCase(Locale.ROOT)));
            if (todos == null) {
                return Collections.emptyList();
            }
            return todos;
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    public void add(ToDoType type, Todo todo) {
        add(type.name(), todo);
    }

    public void add(String type, Todo todo) {
        ToDoType key = ToDoType.valueOf(type.toUpperCase(Locale.ROOT));
        List<Todo> todos = this.map.get(key);

        if (todos == null) {
            map.put(key, Collections.singletonList(todo));
        } else {
            List<Todo> list = new ArrayList<>(todos);
            list.add(todo);
            map.put(key, list);
        }
    }

    public List<Task> getTasks(LocalDate date) {
        List<Task> taskList = new ArrayList<>();
        for (Todo todo : getTodos(ToDoType.TASK)) {
            Task task = (Task) todo;
            if (date.equals(task.getTime().toLocalDate())) {
                taskList.add(task);
            }
        }
        return taskList;
    }

    public List<Event> getEvents(LocalDateTime time) {

        List<Event> taskList = new ArrayList<>();
        for (Todo todo : getTodos(ToDoType.EVENT)) {
            Event event = (Event) todo;
            if (time.isAfter(event.getStartTime()) && time.isBefore(event.getEndTime())) {
                taskList.add(event);
            }
        }
        return taskList;
    }

}
