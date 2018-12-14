package syntax1;

import java.util.List;

public interface Map61B<K, V> {
    /** Associate key with value.
     */
    void put(K key, V value);

    /** Checks to see if arraymap contains the key.
     */
    boolean containsKey(K key);

    /** Returns value, assuming key exists.
     */
    V get(K key);

    /** Returns a list of all keys.
     */
    List<K> keys();

    /** Returns number of keys.
     */
    int size();
}
