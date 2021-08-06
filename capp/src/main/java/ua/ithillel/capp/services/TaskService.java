package ua.ithillel.capp.services;

import ua.ithillel.capp.model.Task;
import ua.ithillel.capp.model.TaskState;

import java.util.List;

public interface TaskService {
    List<Task> getAll();
    List<Task> getInStatus(TaskState state);
    void addTask(Task task);
    void setState(Integer taskId, TaskState state);
}
