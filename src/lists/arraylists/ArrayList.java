package lists.arraylists;

import lists.List;

public class ArrayList<T> implements List<T> {
    private T[] content;
    private int index;

    public ArrayList() {
        this.content = (T[]) new Object[0];
        this.index = 0;
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T obj) {
        if (this.indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public int indexOf(T obj) {
        for (int i = 0; i < this.size(); i++) {
            if (this.content[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(T obj) {
        if (this.size() == 0) {
            this.content = (T[]) new Object[1];
            this.content[0] = obj;
            this.index++;
            return;
        }

        T[] temp = this.content;
        this.content = (T[]) new Object[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            this.content[i] = temp[i];
        }
        this.content[temp.length] = obj;
        this.index++;
    }

    @Override
    public void add(int i, T obj) throws Exception {
        if (i > this.size()) {
            throw new Exception();
        }
        if (i == this.size()) {
            T[] temp = this.content;
            this.content = (T[]) new Object[temp.length * 2];
            for (int j = 0; j < temp.length; j++) {
                this.content[j] = temp[j];
            }
            this.content[i] = obj;
            this.index++;
            return;
        }
        for (int j = this.size(); j > i; j--) {
            this.content[j] = this.content[j-1];
        }
        this.content[i] = obj;
        this.index++;
    }

    @Override
    public void addAll(T[] list) {
        for (T obj : list) {
            this.add(obj);
        }
    }

    @Override
    public T get(int i) throws Exception {
        if (this.isEmpty() || i >= this.size()) {
            throw new Exception();
        }
        return this.content[i];
    }

    @Override
    public void remove(int i) {
        for (int j = i; j < this.size() - 1; j++) {
            this.content[j] = this.content[j+1];
        }
        this.content[this.size() - 1] = null;
        this.index--;
    }
}
