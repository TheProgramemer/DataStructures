package lists;

public interface List<T> {
    int size();
    boolean isEmpty();
    boolean contains(T obj);
    int indexOf(T obj);
    void add(T obj);
    void add(int i, T obj) throws Exception ;
    void addAll(T[] list);
    T get(int i) throws Exception ;
    void remove(int i);
}
