package lesson23.controller;

import lesson23.model.Task;
import lesson23.service.InputService;
import lesson23.service.TaskService;

public class TaskController {

    private final InputService inputService;
    private final TaskService taskService;

    public TaskController(TaskService taskService, InputService inputService) {
        this.inputService = inputService;
        this.taskService = taskService;
    }

    public void show() {
        while (true) {
            System.out.println("Tasks");
            System.out.println("1 - Add task");
            System.out.println("2 - Show all tasks");
            System.out.println("3 - Show all not completed");
            System.out.println("4 - Show all completed");
//            System.out.println("5 - Edit task");
//            System.out.println("6 - Delete task");
            System.out.println("0 - Return");
            System.out.println("------------------------");
            final int nextInt = inputService.nextInt();
            switch (nextInt) {
                case 0:
                    return;
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
            }
        }
    }

    public void add() {
        System.out.println("Adding a new Task");
        final String desc = inputService.getLine("Input Description: ");
        taskService.add(new Task(desc));
        System.out.println("\nNew Task was added successfully\n");
    }

    public void showAll() {
        System.out.println("Showing all Tasks");
        taskService.getAll().forEach(System.out::println);
        System.out.println();
    }
}
