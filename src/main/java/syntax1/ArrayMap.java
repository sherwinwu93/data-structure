package syntax1;

import java.util.ArrayList;
import java.util.List;

public class ArrayMap<K, V> implements Map61B<K, V> {
    private K[] keys;
    private V[] values;
    private int size;

    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key) {
        for (int i = 0; i < keys.length; i++) {
            if (key.equals(keys[i])) {
                return i;
            }
        }
        return -1;
    }

    public void put(K key, V value) {
        int index = keyIndex(key);
        if (index == -1) {
            index = size;
        }
        keys[index] = key;
        values[index] = value;
        size += 1;
    }

    public boolean containsKey(K key) {
        return keyIndex(key) > -1;
    }

    public V get(K key) {
        int index = keyIndex(key);
        return values[index];
    }

    public List<K> keys() {
        List<K> list = new ArrayList<>();
        for (int i = 0; i < size; i += 1) {
            list.add(keys[i]);
        }
        return list;
    }

    public int size() {
        return size;
    }
}
