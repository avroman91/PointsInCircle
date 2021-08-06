package ua.ithillel.capp;

import ua.ithillel.capp.services.InMemoryTasksService;
import ua.ithillel.capp.services.TaskService;
import ui.TaskView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskView taskView = new TaskView(scanner);
        TaskService taskService = new InMemoryTasksService();

    }
}
