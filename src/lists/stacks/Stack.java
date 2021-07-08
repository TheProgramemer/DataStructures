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
        Node temp = this.current;
        while (temp != null) {
            if (((T) temp.value()).equals(value)) {
                return true;
            }
            temp = temp.prev();
        }
        return false;
    }

    public T peek() {
        if (this.current == null) {
            return null;
        }
        return (T) this.current.value();
    }

    public T pop() {
        if (this.current == null) {
            return null;
        }
        T value = (T) this.current.value();
        this.current = this.current.prev();
        return value;
    }

    public void push(T value) {
        Node newNode = new Node(value, this.current);
        this.current = newNode;
    }
}
