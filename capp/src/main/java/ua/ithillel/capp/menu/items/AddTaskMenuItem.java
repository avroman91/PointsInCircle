package ua.ithillel.capp.menu.items;

import lombok.RequiredArgsConstructor;
import ua.ithillel.capp.menu.MenuItem;
import ua.ithillel.capp.model.Task;
import ua.ithillel.capp.services.TaskService;
import ui.TaskView;

import java.util.Scanner;

@RequiredArgsConstructor

public class AddTaskMenuItem implements MenuItem {

    private final TaskService taskService;
    private final TaskView taskView;

    @Override
    public String getName() {
        return "Add task";
    }

    @Override
    public void run() {
        System.out.println("Create a new task");
        Task task = taskView.readTask();
    }
}
