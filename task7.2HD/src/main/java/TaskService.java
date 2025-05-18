import java.util.List;

public class TaskService {
    public TaskDetails viewTaskDetails(String studentId, String taskId) {
        // Simulated data logic
        if (taskId.equals("123")) {
            return new TaskDetails("Well done!", List.of("Hi, good job", "Thanks!"));
        } else if (taskId.equals("456")) {
            return new TaskDetails("Feedback pending", List.of());
        }
        return new TaskDetails("Invalid task", List.of());
    }
}
