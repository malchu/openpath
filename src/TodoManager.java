import java.util.*;

/**
 * Manages a collection of Todo items in memory.
 * Provides CRUD operations: create, read, update, delete.
 */
public class TodoManager {

    // Stores todos with insertion order preserved
    private final Map<Integer, Todo> todos = new LinkedHashMap<>();
    private int nextId = 1; // auto-incremented ID for new todos

    /**
     * Adds a new todo item with the given description.
     * @param description description of the task
     * @return the created Todo object
     */
    public Todo add(String description) {
        Todo todo = new Todo(nextId++, description); // create new Todo
        todos.put(todo.getId(), todo);              // store in map
        return todo;
    }

    /**
     * Returns all todos in the order they were added.
     * @return list of todos
     */
    public List<Todo> list() {
        return new ArrayList<>(todos.values());
    }

    /**
     * Retrieves a todo by its ID.
     * @param id todo identifier
     * @return Optional containing the todo if found
     */
    public Optional<Todo> get(int id) {
        return Optional.ofNullable(todos.get(id));
    }

    /**
     * Marks a todo as completed if it exists.
     * @param id todo identifier
     * @return true if successfully marked, false otherwise
     */
    public boolean complete(int id) {
        Todo todo = todos.get(id);
        if (todo != null && !todo.isCompleted()) {
            todo.markCompleted(); // mark as done
            return true;
        }
        return false;
    }

    /**
     * Deletes a todo by its ID.
     * @param id todo identifier
     * @return true if deleted, false if not found
     */
    public boolean delete(int id) {
        return todos.remove(id) != null;
    }
}
