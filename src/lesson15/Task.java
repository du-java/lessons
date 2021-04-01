package lesson15;

import java.time.LocalDateTime;
import java.util.List;

public class Task implements Todo {

    private String name;
    private LocalDateTime time;
    private List<Task> subTaskList;

    public Task() {    }

    public Task(String name, LocalDateTime time, List<Task> subTaskList) {
        this.name = name;
        this.time = time;
        this.subTaskList = subTaskList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<Task> getSubTaskList() {
        return subTaskList;
    }

    public void setSubTaskList(List<Task> subTaskList) {
        this.subTaskList = subTaskList;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", subTaskList=" + subTaskList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        if (time != null ? !time.equals(task.time) : task.time != null) return false;
        return subTaskList != null ? subTaskList.equals(task.subTaskList) : task.subTaskList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (subTaskList != null ? subTaskList.hashCode() : 0);
        return result;
    }
}
