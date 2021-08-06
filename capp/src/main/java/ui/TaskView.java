package ui;

import lombok.RequiredArgsConstructor;
import ua.ithillel.capp.model.Task;
import ua.ithillel.capp.model.TaskState;

import java.util.List;
import java.util.Scanner;

@RequiredArgsConstructor
public class TaskView {

    private final Scanner sc;

    public Task readTask(){
        System.out.println("Enter task name:");
        String name = sc.nextLine();
        System.out.println("Enter task description:");
        String description = sc.nextLine();

        return new Task()
                .setName(name)
                .setDescription(description)
                .setState(TaskState.NEW);
    }

    public Integer readTaskId(){
        System.out.println("Enter task id:");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }
    public void writeTask(Task task){
        System.out.printf("%d - %s [%s] \n\t %s\n",
                task.getId(),
                task.getName(),
                task.getState().getName(),
                task.getDescription());
    }

    public void writeAllTasks(List<Task> tasks){
        System.out.println("-----------------------TASKS-----------------------");
        for (Task task : tasks) {
            writeTask(task);
        }
        System.out.println("-----------------------TASKS-----------------------");
    }
}
