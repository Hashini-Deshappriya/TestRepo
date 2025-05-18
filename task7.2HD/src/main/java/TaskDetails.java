import java.util.List;

public class TaskDetails {
    private String feedback;
    private List<String> chatMessages;

    public TaskDetails(String feedback, List<String> chatMessages) {
        this.feedback = feedback;
        this.chatMessages = chatMessages;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<String> getChatMessages() {
        return chatMessages;
    }

}
