package lists.linkedlists.doublylinkedlists;

public class Node<T> {
    private T value;
    private Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    public T value() {
        return this.value;
    }

    public Node next() {
        return this.next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }
}
