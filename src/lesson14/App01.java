package lesson14;

import java.util.HashMap;
import java.util.Map;

public class App01 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        String key2 = map.get("key2");
        String key = map.get("key");

        System.out.println(key);

        String key3 = map.remove("key3");

        System.out.println(key3);

        String key4 = map.put("key4", "new key4");
        System.out.println(key4);
        String key5 = map.put("key5", "new key4");
        System.out.println(key5);


    }
}
