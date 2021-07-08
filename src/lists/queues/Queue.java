package lists.queues;

public class Queue<T> {
    private Node head;
    private Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean contains(T value) {
        return false;
    }

    public T peek() {
        return null;
    }

    public T poll() {
        return null;
    }

    public void push(T value) {
    }
}
