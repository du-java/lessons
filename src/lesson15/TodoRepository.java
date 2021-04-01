package lesson15;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TodoRepository {

    private Map<ToDoType, List<Todo>> todos = new HashMap<>();
    private static final Logger logger = Logger.getLogger(TodoRepository.class.getName());


    public List<Todo> getTodos(String type) {
        try {
            List<Todo> todos = this.todos.get(ToDoType.valueOf(type.toUpperCase(Locale.ROOT)));
            if (todos == null) {
                return Collections.emptyList();
            }
            return todos;
        } catch (IllegalArgumentException e) {
            logger.log(
                    Level.SEVERE, e.getMessage(), e
            );
            return Collections.emptyList();
        }
    }


    public void add(String type, Todo todo) {

    }
}
