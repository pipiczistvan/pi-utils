package piutils.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * An object that maps keys to value sets.
 *
 * @param <K> The type of the keys
 * @param <V> The type of the sets
 */
public class SetMap<K, V> {

    private Map<K, Set<V>> map;

    public SetMap() {
        map = new HashMap<>();
    }

    /**
     * Puts a value into the set of the given key. If no set exist for the key, a new set will be created.
     *
     * @param key   The requested key
     * @param value The value to be inserted
     * @return The inserted value
     */
    public V put(K key, V value) {
        Set<V> set = map.get(key);
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(value);
        map.put(key, set);

        return value;
    }

    /**
     * Returns the set for the given key. If no set exists for the key, an empty set will return.
     *
     * @param key The requested key
     * @return The set
     */
    public Set<V> get(K key) {
        Set<V> set = map.get(key);
        return set != null ? set : new HashSet<>();
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
