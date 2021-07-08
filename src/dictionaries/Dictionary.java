package dictionaries;

public interface Dictionary<K, V> {
    int size();
    boolean isEmpty();
    boolean containsKey(K key);
    boolean containsValue(V value);
    void put(K key, V value);
    void replace(K key, V value);
    V get(K key);
    void remove(K key);
}
