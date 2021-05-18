package lesson15;

import java.util.List;

public class App01 {
    public static void main(String[] args) {

        TodoRepository todoRepository = new TodoRepository();

        List<Todo> asd = todoRepository.getTodos("asd");
        if (asd != null && asd.isEmpty()) {

        }

        todoRepository.add(ToDoType.TASK, new Task());
        todoRepository.add(ToDoType.TASK, new Task());


    }
}
