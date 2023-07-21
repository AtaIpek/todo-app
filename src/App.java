import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Objective:

        // ---------- Alper ----------
        TodoGenerator todoGenerator = new TodoPrompter();
        List<Todo> gottenTodos = todoGenerator.getMultipleTodos();

        // ---------- Ata ----------
        TodoList todoList = new TodoList();

        for (Todo todo : gottenTodos) {
            todoList.add(todo);
        }
        todoList.print();

        todoList.sortByPriority();
        todoList.print();
    }
}
