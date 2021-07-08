package dictionaries;

public class HashMap<K, V> implements Dictionary {
    private Entry[] entries;
    private int size;
    public HashMap() {
        this.entries = new Entry[100000];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object key) {
        return false;
    }

    @Override
    public void put(Object key, Object value) {
        this.size++;
    }

    @Override
    public void replace(Object key, Object value) {

    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public void remove(Object key) {
        this.size--;
    }
}
