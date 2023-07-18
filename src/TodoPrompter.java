import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoPrompter implements TodoGenerator {
    private final Scanner scanner;

    public TodoPrompter() {
        this.scanner = new Scanner(System.in);
    }

    public Todo getTodo() {
        String title = "";
        while (title.equals("")) {
            System.out.print("Enter a title: ");
            title = this.scanner.nextLine();
        }

        String description = "";
        while (description.equals("")) {
            System.out.print("Enter a description: ");
            description = this.scanner.nextLine();
        }

        int priority = -1;
        while (priority < 0) {
            System.out.print("Enter a priority: ");
            try {
                priority = Integer.parseInt(this.scanner.nextLine());

                if (priority < 0) {
                    System.out.println("[ERROR] Priority must be bigger than or equal to 0");
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "[ERROR] Invalid priority. Priority must be an integer that is bigger than or equal to 0");
            }
        }

        return new Todo(title, description, priority);
    }

    public List<Todo> getMultipleTodos() {
        List<Todo> todos = new ArrayList<Todo>();

        boolean isOver = false;
        while (!isOver) {
            todos.add(this.getTodo());

            System.out.print("Continue? [Y/n]: ");
            String answer = this.scanner.nextLine();

            if (answer.equals("n")) {
                isOver = true;
            }
        }

        return todos;
    }

}
