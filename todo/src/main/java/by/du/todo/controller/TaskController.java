package by.du.todo.controller;

import by.du.todo.model.Task;
import by.du.todo.service.InputService;
import by.du.todo.service.TaskService;
import by.du.todo.service.TranslateService;

public class TaskController implements Controller {

    private final InputService inputService;
    private final TaskService taskService;

    public TaskController(final TaskService taskService, final InputService inputService) {
        this.inputService = inputService;
        this.taskService = taskService;
    }

    public void show() {
        while (true) {
            System.out.println("Tasks");
            System.out.println("1 - " + TranslateService.getString("addTask"));
            System.out.println("2 - " + TranslateService.getString("allTask"));
            System.out.println("3 - " + TranslateService.getString("showNotCompletedTask"));
            System.out.println("4 - " + TranslateService.getString("showCompletedTask"));
            System.out.println("5 - " + TranslateService.getString("editTask"));
            System.out.println("6 - " + TranslateService.getString("deleteTask"));
            System.out.println("7 - " + TranslateService.getString("markCompletedTask"));
            System.out.println("0 - " + TranslateService.getString("return"));
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
                    break;
                case 3:
                    showAllNotCompleted();
                    break;
                case 4:
                    showAllCompleted();
                    break;
                case 5:
                    edit();
                    break;
                case 6:
                    delete();
                    break;
                case 7:
                    mark();
                    break;
                default:
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

    public void showAllNotCompleted() {
        System.out.println("Showing all not completed task");
        taskService.getAllNotCompleted().forEach(System.out::println);
        System.out.println();
    }

    public void showAllCompleted() {
        System.out.println("Showing all completed task");
        taskService.getAllCompleted().forEach(System.out::println);
        System.out.println();
    }

    public void delete() {
        int id = inputService.nextInt("Input id to delete");
        taskService.delete(id);
    }

    public void edit() {
        final int id = inputService.nextInt("Input task id");
        final Task task = taskService.getById(id);
        final String newDesc = inputService.getLine("Input new Description or press Enter to skip");
        if (newDesc != null && !newDesc.isEmpty()) {
            task.setDesc(newDesc);
        }
        taskService.save(task);
    }

    public void mark() {
        final int id = inputService.nextInt("Input task id");
        final Task task = taskService.getById(id);
        task.setCompleted(true);
        taskService.save(task);
    }
}
