package lists.stacks;

public class Node<T> {
    private T value;
    private Node prev;

    public Node(T value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public T value() {
        return this.value;
    }

    public Node prev() {
        return this.prev;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public boolean hasPrev() {
        return this.prev != null;
    }
}
