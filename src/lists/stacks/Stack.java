package lists.stacks;

public class Stack<T> {
    private Node current;

    public Stack() {
        this.current = null;
    }

    public boolean isEmpty() {
        return this.current == null;
    }

    public boolean contains(T value) {
        return false;
    }

    public T peek() {
        return null;
    }

    public T pop() {
        return null;
    }

    public void push(T value) {
    }
}
