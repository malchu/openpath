import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for TodoManager.
 */
class TodoManagerTest {

    @Test
    void testAddAndList() {
        TodoManager manager = new TodoManager();
        manager.add("Task 1");
        manager.add("Task 2");

        // Ensure both tasks were added
        assertEquals(2, manager.list().size());
    }

    @Test
    void testCompleteTask() {
        TodoManager manager = new TodoManager();
        Todo t = manager.add("Task");

        // Complete the task and check it is marked completed
        assertTrue(manager.complete(t.getId()));
        assertTrue(manager.get(t.getId()).get().isCompleted());
    }

    @Test
    void testDeleteTask() {
        TodoManager manager = new TodoManager();
        Todo t = manager.add("Delete me");

        // Delete the task and ensure it no longer exists
        assertTrue(manager.delete(t.getId()));
        assertFalse(manager.get(t.getId()).isPresent());
    }

    @Test
    void testInvalidDescription() {
        TodoManager manager = new TodoManager();

        // Adding a blank description should throw exception
        assertThrows(IllegalArgumentException.class, () -> manager.add(" "));
    }
}
