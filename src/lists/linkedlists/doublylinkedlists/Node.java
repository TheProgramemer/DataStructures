package lists.linkedlists.doublylinkedlists;

public class Node<T> {
    private T value;
    private Node next;
    private Node prev;

    public Node(T value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public T value() {
        return this.value;
    }

    public Node next() {
        return this.next;
    }

    public Node prev() {
        return this.prev;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public boolean hasPrev() {
        return this.prev != null;
    }
}
