package lesson21;

import java.util.*;

public class App02 {

    public static void main(String[] args) {

        final Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "one");
        map.put(5, "one");
        map.put(6, "two");

        final Map<String, Collection<Integer>> reverse = reverse(map);
        System.out.println(reverse);

        Set<Pair<String, Integer>> pair = new HashSet<>();
    }

    public static <K, V> Map<V, Collection<K>> reverse(Map<K, V> map) {
        Map<V, Collection<K>> reversedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            final Collection<K> keysCollection = reversedMap.get(entry.getValue());
            if (keysCollection == null) {
                final Set<K> keysSet = new HashSet<>();
                keysSet.add(entry.getKey());
                reversedMap.put(entry.getValue(), keysSet);
            } else {
                keysCollection.add(entry.getKey());
                reversedMap.put(entry.getValue(), keysCollection);
            }
        }
        return reversedMap;
    }

}

class Pair<K, V> {
    K key;
    V value;
}
