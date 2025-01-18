# The-CLI

The link to the project goes here https://roadmap.sh/projects/task-tracker


## Task Tracker CLI

---

# Task Tracker CLI

A simple command-line interface (CLI) application built in Java to track and manage tasks. This project allows users to add, list, update, and mark tasks as in progress or done. Tasks are stored in memory while the program is running.

## Features

- **Add Task**: Allows the user to add a new task with a title.
- **List Tasks**: Lists all tasks with their current status (Pending, In Progress, or Done).
- **Update Task**: Allows the user to update the status of a task.
- **Mark Task as In Progress**: Mark a task as "In Progress".
- **Mark Task as Done**: Mark a task as "Done".
- **Exit**: Exit the application.

## Requirements

- **Java 8 or higher**: Make sure you have Java installed on your machine.
- **IDE**: You can use IntelliJ IDEA, Eclipse, or any Java IDE of your choice to run the project.

## Setup

1. **Clone the Repository**  
   Clone the repository to your local machine or download the code files.

2. **Install Java**  
   Make sure Java 8 or higher is installed on your machine. You can download it from [Oracle's Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

3. **Run the Application**  
   - Open the project in your preferred IDE.
   - Locate the `TaskTrackerCLI.java` file and run it.

4. **CLI Usage**  
   Upon running the program, the following menu will appear:

   ```
   Task Tracker CLI
   1. Add Task
   2. List Tasks
   3. Update Task
   4. Mark Task as In Progress
   5. Mark Task as Done
   6. Exit
   Enter choice:
   ```

   - To add a new task, select **1** and enter the task title.
   - To list all tasks, select **2**.
   - To update a task's status, select **3** and enter the task ID and new status.
   - To mark a task as "In Progress," select **4**.
   - To mark a task as "Done," select **5**.
   - To exit the application, select **6**.

## Example

Here’s an example of how the program runs:

```
Task Tracker CLI
1. Add Task
2. List Tasks
3. Update Task
4. Mark Task as In Progress
5. Mark Task as Done
6. Exit
Enter choice: 1
Enter task title: Complete Java project
Task added: ID: f4f7cfa2-32fd-44e6-9e83-3a9c84c27e8a, Title: Complete Java project, Status: Pending

Task Tracker CLI
1. Add Task
2. List Tasks
3. Update Task
4. Mark Task as In Progress
5. Mark Task as Done
6. Exit
Enter choice: 2
ID: f4f7cfa2-32fd-44e6-9e83-3a9c84c27e8a, Title: Complete Java project, Status: Pending

Task Tracker CLI
1. Add Task
2. List Tasks
3. Update Task
4. Mark Task as In Progress
5. Mark Task as Done
6. Exit
Enter choice: 3
Enter task ID to update: f4f7cfa2-32fd-44e6-9e83-3a9c84c27e8a
Enter new status (Pending/In Progress/Done): In Progress
Task updated: ID: f4f7cfa2-32fd-44e6-9e83-3a9c84c27e8a, Title: Complete Java project, Status: In Progress
```

## Future Improvements

- **Persistent Storage**: Currently, the tasks are stored only in memory. In the future, tasks can be saved to a file (e.g., JSON, CSV, or a simple text file) to persist data between sessions.
- **Error Handling**: Add better error handling and validation for user inputs (e.g., invalid task ID or invalid status).
- **Search Tasks**: Implement a search feature to find tasks by title or status.

## License

This project is open-source and available under the [MIT License](LICENSE).

---

### Feel free to customize and expand this README to suit your project’s needs! Let me know if you'd like further modifications.


