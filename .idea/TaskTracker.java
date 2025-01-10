import toolbarButtonGraphics.Task;

import java.util.*;

public class TaskTracker {

    private static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Tracker CLI");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Mark Task as In Progress");
            System.out.println("5. Mark Task as Done");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask(scanner);
                    break;
                case "2":
                    listTasks();
                    break;
                case "3":
                    updateTask(scanner);
                    break;
                case "4":
                    markTaskInProgress(scanner);
                    break;
                case "5":
                    markTaskDone(scanner);
                    break;
                case "6":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        Task task = new Task(title, "Pending");
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            tasks.forEach(System.out::println);
        }
    }

    private static void updateTask(Scanner scanner) {
        System.out.print("Enter task ID to update: ");
        String taskId = scanner.nextLine();
        Task task = findTaskById(taskId);
        if (task != null) {
            System.out.print("Enter new status (Pending/In Progress/Done): ");
            String status = scanner.nextLine();
            task.setStatus(status);
            System.out.println("Task updated: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }

    private static void markTaskInProgress(Scanner scanner) {
        System.out.print("Enter task ID to mark as In Progress: ");
        String taskId = scanner.nextLine();
        Task task = findTaskById(taskId);
        if (task != null) {
            task.setStatus("In Progress");
            System.out.println("Task marked as In Progress: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }

    private static void markTaskDone(Scanner scanner) {
        System.out.print("Enter task ID to mark as Done: ");
        String taskId = scanner.nextLine();
        Task task = findTaskById(taskId);
        if (task != null) {
            task.setStatus("Done");
            System.out.println("Task marked as Done: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }

    private static Task findTaskById(String id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }
}
