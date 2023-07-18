import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(Todo todo) {
        list.add(todo);
    }

    public void print() {
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }
}
