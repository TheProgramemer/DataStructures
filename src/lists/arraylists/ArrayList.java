package lists.arraylists;

import lists.List;

public class ArrayList<T> implements List<T> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T obj) {
        return false;
    }

    @Override
    public int indexOf(T obj) {
        return -1;
    }

    @Override
    public void add(T obj) {
    }

    @Override
    public void add(int i, T obj) {
    }

    @Override
    public void addAll(T[] list) {
    }

    @Override
    public T get(int i) {
        return (T) new Object();
    }

    @Override
    public void remove(int i) {
    }
}
