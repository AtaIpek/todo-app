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
        System.out.println("------------------------------------------------");
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.print(list.get(i) + " || ");
        }
        System.out.println();
    }

    public void sortByPriority() {
        List<Todo> arr = list;

        Todo temp;
        for (int j = 0; j <= arr.size(); j++) {
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i).compareTo(arr.get(i + 1)) > 0) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                }
            }
        }
    }
}
// 4 26 3 1 7: