package ua.ithillel.capp.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TaskState {
    NEW("New"),IN_PROGRESS("In progress"),COMPLETED("Completed");
    @Getter
    private final String name;


}
