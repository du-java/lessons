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
//            throw  new IllegalArgumentException();
//            throw e;
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

    public List<Task> getTasksByDate(LocalDate date) {
        List<Task> taskList = new ArrayList<>();
        for (Todo todo : getTodos(ToDoType.TASK)) {
            Task task = (Task) todo;
            if (date.equals(task.getTime().toLocalDate())) {
                taskList.add(task);
            }
        }
        return taskList;
    }

    public List<Event> getEventsByTime(LocalDateTime time) {
        List<Event> taskList = new ArrayList<>();
        for (Todo todo : getTodos(ToDoType.EVENT)) {
            Event event = (Event) todo;
            if (time.isAfter(event.getStartTime()) && time.isBefore(event.getEndTime())) {
                taskList.add(event);
            }
        }
        return taskList;
    }

    public List<Task> getSortedTasksByTime() {
        List<Task> taskList = getTaskList();
        taskList.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getTime().compareTo(o2.getTime());
            }
        });
        return taskList;
    }

    public List<Task> getSortedTasksByCount() {
        List<Task> taskList = getTaskList();
        Comparator<Task> comparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getSubTaskList().size() - o2.getSubTaskList().size();
            }
        };
        taskList.sort(comparator.reversed());
        return taskList;
    }

    public List<Event> getSortedEventsByStartTime() {
        List<Event> eventList = getEventList();
        eventList.sort(new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        });
        return eventList;
    }

    public List<Event> getSortedEventsByBusy() {
        List<Event> eventList = getEventList();
        eventList.sort(new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return Boolean.compare(o2.isBusy(), o1.isBusy());
            }
        });
        return eventList;
    }

    private List<Event> getEventList() {
        List<Event> events = new ArrayList<>();
        for (Todo todo : getTodos(ToDoType.EVENT)) {
            Event event = (Event) todo;
            events.add(event);
        }
        return events;
    }

    private List<Task> getTaskList() {
        List<Task> taskList = new ArrayList<>();
        for (Todo todo : getTodos(ToDoType.TASK)) {
            Task task = (Task) todo;
            taskList.add(task);
        }
        return taskList;
    }

    private <K, V> Map<V, K> swap(Map<K, V> map) {
        Map<V, K> swapMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            swapMap.put(entry.getValue(), entry.getKey());
        }
        return swapMap;
    }

    private <K, V> Map<V, Collection<K>> swap1(Map<K, V> map) {
        Map<V, Collection<K>> swapMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            Collection<K> collection = swapMap.get(entry.getValue());

            if (collection == null) {
                swapMap.put(entry.getValue(), Collections.singletonList(entry.getKey()));
            } else {
                List<K> list = new ArrayList<>(collection);
                list.add(entry.getKey());
                swapMap.put(entry.getValue(), list);
            }
        }
        return swapMap;
    }
}
