public class Todo implements Comparable<Todo> {
    private final String title;
    private final String description;
    private final int priority;
    private boolean isDone;

    public Todo() {
        this.title = "";
        this.description = "";
        this.priority = 0;
        this.isDone = false;
    }

    public Todo(String title, String description, int priority) {
        if (priority < 0) {
            throw new IllegalArgumentException("Priority must be >= 0");
        }

        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isDone = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPriority() {
        return this.priority;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public int compareTo(Todo other) {
        return this.priority - other.priority;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other.getClass() == this.getClass())) {
            return false;
        }

        Todo otherTodo = (Todo) other;

        return this.title.equals(otherTodo.title)
                && this.description.equals(otherTodo.description)
                && this.priority == otherTodo.priority
                && this.isDone == otherTodo.isDone;
    }

    @Override
    public String toString() {
        return String.format(
                "Title: %s, Description: %s, Priority: %d, Done: %b",
                this.title, this.description, this.priority, this.isDone);
    }

}
