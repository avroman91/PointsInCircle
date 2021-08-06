package ua.ithillel.capp.services;

import ua.ithillel.capp.model.Task;
import ua.ithillel.capp.model.TaskState;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTasksService implements TaskService{
    List<Task> list = new ArrayList<>();

    @Override
    public List<Task> getAll() {
        return list;
    }

    @Override
    public List<Task> getInStatus(TaskState state) {
        List<Task> taskInState=new ArrayList<>();
        for (Task task : list) {
            if(task.getState()==state){
                taskInState.add(task);
            }
        }
        return taskInState;
    }

    @Override
    public void addTask(Task task) {
        int id = 0;
        if(list.size()>0){
            int max = list.get(0).getId();
            for (Task task1 : list) {
                if(task1.getId()>max) max = task1.getId();
            }
            id=max+1;
        }
        task.setId(id);
    }

    private Task getById(Integer taskId){
        for (Task task : list) {
            if (task.getId() == taskId) return task;
        }
        return null;
    }

    @Override
    public void setState(Integer taskId, TaskState state) {
        Task task = getById(taskId);
        task.setState(state);
    }
}
