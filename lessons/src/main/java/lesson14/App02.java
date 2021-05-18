package lesson14;

import java.util.*;

public class App02 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value3");

        System.out.println(map);

        Map<String, String> map1 = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(map1.put(entry.getValue(), entry.getKey()));
        }

        Iterator<String> iterator = map.keySet().iterator();
        Set<String> set = new HashSet<>();

        while (iterator.hasNext()) {
            String value = map.get(iterator.next());
            if (set.contains(value)) {
                iterator.remove();
            } else {
                set.add(value);
            }
        }

        System.out.println(map);
        System.out.println(map1);


    }
}
