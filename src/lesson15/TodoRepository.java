package lesson15;

import java.util.*;

public class TodoRepository {

    private Map<ToDoType, List<Todo>> todos = new HashMap<>();

    public List<Todo> getTodos(String type) {
        List<Todo> todos = this.todos.get(ToDoType.valueOf(type.toUpperCase(Locale.ROOT)));
        if(todos == null){
            return Collections.emptyList();
        }
        return  todos;
    }

    public void add(String type,Todo todo) {

    }
}
