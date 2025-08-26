/**
 * Represents a single todo task in the system.
 * Each todo has:
 * - a unique immutable ID
 * - a description
 * - a completion status
 */
public class Todo {

    private final int id;        // unique identifier
    private String description;  // task description
    private boolean completed;   // true if task is done

    /**
     * Creates a new Todo item.
     *
     * @param id          unique identifier
     * @param description description of the task (cannot be null or blank)
     * @throws IllegalArgumentException if description is null or empty
     */
    public Todo(int id, String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }
        this.id = id;
        this.description = description;
        this.completed = false; // new tasks are incomplete by default
    }

    /** @return the unique ID of the todo */
    public int getId() {
        return id;
    }

    /** @return the task description */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a new description for the todo.
     *
     * @param description new description (cannot be null or blank)
     * @throws IllegalArgumentException if description is null or blank
     */
    public void setDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }
        this.description = description;
    }

    /** @return true if the task is completed, false otherwise */
    public boolean isCompleted() {
        return completed;
    }

    /** Marks the task as completed */
    public void markCompleted() {
        this.completed = true;
    }

    /**
     * Returns a string representation of the todo.
     *
     * @return formatted string like "[1] Task description (done)"
     */
    @Override
    public String toString() {
        return String.format("[%d] %s %s", id, description, completed ? "(done)" : "");
    }
}
