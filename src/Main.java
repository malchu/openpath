/**
 * Demo runner for the Todo List application.
 * Shows basic usage of TodoManager.
 */
public class Main {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();

        // Add some sample todos
        manager.add("Finish Java project");
        manager.add("Read 10 pages of a book");
        manager.add("Go for a run");

        // Print all todos
        System.out.println("All Todos:");
        manager.list().forEach(System.out::println);

        // Complete the second task
        manager.complete(2);

        System.out.println("\nAfter completing task 2:");
        manager.list().forEach(System.out::println);
    }
}
