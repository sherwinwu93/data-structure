package syntax1.ex01;

/**
 * A map is a collection of key-value mappings, like a dictionary in Python.
 * Like a set, the keys in a map are unique.
 */
public interface Map<K, V> {
    V put(K key, V value);
    V get(K key);
    boolean containsKey(Object key);
    Set<K> keySet();
}
