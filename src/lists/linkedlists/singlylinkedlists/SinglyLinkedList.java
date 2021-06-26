package lists.linkedlists.singlylinkedlists;

import lists.List;

public class SinglyLinkedList<T> implements List<T> {
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public void add(Object obj) {

    }

    public void addFirst(Object obj) {

    }

    @Override
    public void add(int i, Object obj) throws Exception {

    }

    @Override
    public void addAll(T[] list) {
        for (T obj : list) {
            this.add(obj);
        }
    }

    @Override
    public T get(int i) throws Exception {
        return null;
    }

    public T getFirst() {
        return null;
    }

    public T getCurrent() {
        return null;
    }

    public T getLast() {
        return null;
    }

    public T next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove(int i) {

    }

    public void removeFirst() {

    }

    public void removeLast() {

    }
}
