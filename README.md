# Todo List (Java, OOP + Tests)
## Overview
I developed a small Todo List application in Java as a coding sample. The goal was to demonstrate clean code, object-oriented design, and test coverage. 
This project is designed as a **coding sample**.

---

## Project Structure
```
src/
 ├── Main.java          # Demo runner
 ├── Todo.java          # Todo model with validation
 └── TodoManager.java   # Business logic / CRUD operations

test/
 └── TodoManagerTest.java  # Unit tests (JUnit 5)
```

---

## Running the Project
Compile and run with `javac` + `java`:

```bash
javac src/*.java
java -cp src Main
```

---

## Running the Tests
This project uses **JUnit 5**. Make sure you have the standalone JAR:

```bash
# Compile with JUnit in the classpath
javac -cp .:junit-platform-console-standalone.jar src/*.java test/*.java

# Run tests
java -jar junit-platform-console-standalone.jar --class-path . --scan-class-path
```

> On Windows, replace `:` with `;` in the classpath.

---

## Example Output
```
All Todos:
[1] Finish Java project 
[2] Read 10 pages of a book 
[3] Go for a run 

After completing task 2:
[1] Finish Java project 
[2] Read 10 pages of a book (done)
[3] Go for a run 
```

---

## Design and Architecture
The project consists of three primary components:

1. **Todo.java** – Represents an individual task with a unique ID, description, and completion status. Includes validation to prevent empty or null descriptions and methods to mark tasks as completed.  
2. **TodoManager.java** – Handles business logic for managing todos, including adding, listing, completing, and deleting tasks. Uses a `LinkedHashMap` to preserve insertion order and returns `Optional<Todo>` for safe null handling.  
3. **Main.java** – Demonstrates basic usage of the TodoManager in a simple command-line interface.

## Testing
Unit tests were implemented using **JUnit 5**, covering:  
- Adding tasks  
- Completing tasks  
- Deleting tasks  
- Validating input for blank descriptions  

## Potential Extensions
If I were to extend this project for production use:  
- Persist tasks in a database.  
- Add priority levels and deadlines for each task.  
- Implement tagging or categorization.  
- Build a REST API or web frontend for user interaction.  
- Add undo/redo functionality or an action history.

---
