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
        Node temp = this.head;
        while (temp != null) {
            if (((T) temp.value()).equals(value)) {
                return true;
            }
            temp = temp.next();
        }
        return false;
    }

    public T peek() {
        if (this.head == null) {
            return null;
        }
        return (T) this.head.value();
    }

    public T poll() {
        if (this.head == null) {
            return null;
        }
        T value = (T) this.head.value();
        this.head = this.head.next();
        if (this.head == null) {
            this.tail = null;
        }
        return value;
    }

    public void push(T value) {
        Node newNode = new Node(value, null);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        this.tail.setNext(newNode);
        this.tail = newNode;
    }
}
