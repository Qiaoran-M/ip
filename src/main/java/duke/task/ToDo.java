package duke.task;
import java.util.List;

/**
 * Represents a task to do with a task description
 * Inherits from Task class
 */
public class ToDo extends Task {

    public ToDo(String description) {
        super(description);
    }

    public ToDo(String description, Boolean isDone, List<String> tags) {
        super(description, isDone, tags);
    }

    @Override
    public String getStatusIcon() {
        return (isDone ? "[T][X]" : "[T][ ]"); // mark done task with X
    }

    public String toString() {
        String status = isDone ? "Done  " : "UnDone";
        return String.format("Todo      | %s | %s | %s", status, super.getDescription(), super.printTags());
    }

    @Override
    public String taskType() {
        return "todo";
    }

}
