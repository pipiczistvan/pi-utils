package piutils.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * An object that maps keys to value lists.
 *
 * @param <K> The type of the keys
 * @param <V> The type of the lists
 */
public class ListMap<K, V> {

    private Map<K, List<V>> map;

    public ListMap() {
        map = new HashMap<>();
    }

    /**
     * Puts a value into the list of the given key. If no list exist for the key, a new list will be created.
     *
     * @param key   The requested key
     * @param value The value to be inserted
     * @return The inserted value
     */
    public V put(K key, V value) {
        List<V> list = map.get(key);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(value);
        map.put(key, list);

        return value;
    }

    /**
     * Returns the list for the given key. If no list exists for the key, an empty list will return.
     *
     * @param key The requested key
     * @return The list
     */
    public List<V> get(K key) {
        List<V> list = map.get(key);
        return list != null ? list : new ArrayList<>();
    }

    /**
     * Returns a Set view of the keys contained in this map.
     * @return The set
     */
    public Set<K> keySet() {
        return map.keySet();
    }

    /**
     * Clears the map.
     */
    public void clear() {
        map.clear();
    }
}
