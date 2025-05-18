import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TaskServiceTest {

    @Test
    public void testFeedbackAndMessagesAvailable() {
        TaskService service = new TaskService();
        TaskDetails result = service.viewTaskDetails("stu01", "123");
        assertEquals("Well done!", result.getFeedback());
        assertEquals(2, result.getChatMessages().size());
    }

    @Test
    public void testFeedbackPendingNoMessages() {
        TaskService service = new TaskService();
        TaskDetails result = service.viewTaskDetails("stu01", "456");
        assertEquals("Feedback pending", result.getFeedback());
        assertTrue(result.getChatMessages().isEmpty());
    }
}
