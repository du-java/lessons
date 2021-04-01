package lesson15;

public class App01 {
    public static void main(String[] args) {

        TodoRepository todoRepository = new TodoRepository();

        todoRepository.getTodos("asd");

        todoRepository.add(ToDoType.TASK, new Task());
        todoRepository.add(ToDoType.TASK, new Task());


    }
}
