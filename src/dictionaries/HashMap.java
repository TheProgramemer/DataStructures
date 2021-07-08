package dictionaries;

public class HashMap<K, V> implements Dictionary {
    private Entry[] entries;
    private int size;
    public HashMap() {
        this.entries = new Entry[99999999];
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
        long hashKey = HashingUtil.hash(key.toString());
        if (entries[(int) hashKey] == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean containsValue(Object key) {
        for (Entry<K,V> entry : this.entries) {
            if (entry != null && entry.getValue().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void put(Object key, Object value) {
        this.size++;
        long hashKey = HashingUtil.hash(key.toString());
        entries[(int) hashKey] = new Entry(key, value);
    }

    @Override
    public void replace(Object key, Object value) {
        if (this.containsKey(key)) {
            long hashKey = HashingUtil.hash(key.toString());
            entries[(int) hashKey] = new Entry(key, value);
        }
    }

    @Override
    public Object get(Object key) {
        if (this.containsKey(key)) {
            long hashKey = HashingUtil.hash(key.toString());
            return entries[(int) hashKey].getValue();
        }
        return null;
    }

    @Override
    public void remove(Object key) {
        if (this.containsKey(key)) {
            long hashKey = HashingUtil.hash(key.toString());
            entries[(int) hashKey] = null;
            this.size--;
        }
    }
}
