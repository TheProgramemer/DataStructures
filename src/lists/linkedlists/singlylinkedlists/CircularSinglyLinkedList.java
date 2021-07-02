package lists.linkedlists.singlylinkedlists;

import lists.linkedlists.CircularLinkedList;

public class CircularSinglyLinkedList<T> implements CircularLinkedList<T> {
    private int size;
    private Node head;
    private Node current;
    private Node tail;

    public CircularSinglyLinkedList() {
        this.size = 0;
        this.head = null;
        this.current = null;
        this.tail = null;
    }

    public CircularSinglyLinkedList(Node head) {
        this.head = head;
        this.current = head;
        this.size = 1;

        Node tracker = this.current;
        while (tracker.hasNext()) {
            tracker = tracker.next();
            this.size++;
        }
        this.tail = tracker;
    }

    public CircularSinglyLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T obj) {
        int index = indexOf(obj);
        if (index == -1) {
            return false;
        }
        return true;
    }

    @Override
    public int indexOf(T obj) {
        Node temp = this.head;
        for (int i = 0; i < this.size(); i++) {
            if (((T) temp.value()).equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(T obj) {
        Node newNode = new Node(obj, null);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.current = newNode;
            this.tail.setNext(newNode);
            this.size++;
            return;
        }
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.tail.setNext(this.head);
        this.size++;
    }

    public void addFirst(T obj) {
        Node newNode = new Node(obj, this.head);
        if (this.head == this.current) {
            this.current = newNode;
        }
        this.head = newNode;
        this.tail.setNext(this.head);
        this.size++;
    }

    @Override
    public void add(int i, T obj) throws Exception {
        if (i > this.size()) {
            throw new Exception();
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        if (i == this.size) {
            add(obj);
            return;
        }
        Node temp = this.head;
        for (int j = 0; j < i; j++) {
            temp = temp.next();
        }
        Node newNode = new Node(obj, temp.next());
        temp.setNext(newNode);
        this.size++;
    }

    @Override
    public void addAll(T[] list) {
        for (T obj : list) {
            this.add(obj);
        }
    }

    @Override
    public T get(int i) throws Exception {
        if (i >= this.size()) {
            throw new Exception();
        }
        Node temp = this.head;
        for (int j = 0; j < i; j++) {
            temp = temp.next();
        }
        return (T) temp.value();
    }

    public T getFirst() {
        return (T) this.head.value();
    }

    public T getCurrent() {
        return (T) this.current.value();
    }

    public T getLast() {
        return (T) this.tail.value();
    }

    public T next() throws Exception {
        if (!this.hasNext()) {
            throw new Exception();
        }
        this.current = this.current.next();
        return (T) this.current.value();
    }

    public boolean hasNext() {
        return this.current.hasNext();
    }

    @Override
    public void remove(int i) {
        Node temp = this.head;
        if (i == 0) {
            removeFirst();
            return;
        }
        if (i == this.size()) {
            removeLast();
            return;
        }
        for (int j = 0; j < i; j++) {
            temp = temp.next();
        }
        Node toRemove = temp.next();
        temp.setNext(toRemove.next());
        toRemove.setNext(null);
        this.size--;
    }

    public void removeFirst() {
        if (this.size == 1) {
            this.head = null;
            this.current = null;
            this.tail = null;
        } else {
            Node temp = this.head;
            this.head = this.head.next();
            this.tail.setNext(this.head);
            temp.setNext(null);
        }
        this.size--;
    }

    public void removeLast() {
        if (this.size == 1) {
            this.head = null;
            this.current = null;
            this.tail = null;
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.size() - 1; i++) {
                temp = temp.next();
            }
            this.tail = temp;
            this.tail.setNext(this.head);
        }
        this.size--;
    }
}
