package lists;

public interface List<T> {
    int size();
    boolean isEmpty();
    boolean contains(T obj);
    int indexOf(T obj);
    void add(T obj);
    void add(int i, T obj);
    void addAll(T[] list);
    T get(int i);
    void remove(int i);
}
