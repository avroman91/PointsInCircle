package ua.ithillel.capp.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Task {
    private Integer id;
    private String name;
    private String description;
    private TaskState state;
}
