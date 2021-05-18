package lesson14;

import java.util.HashMap;
import java.util.Map;

public class App05 {
    public static void main(String[] args) {
        Map<Address, Person> map = new HashMap<>();
        map.put(new Address("Minsk", 1, "Street", 1), new Person("Ivan", "Ivanov", 23 ));
        map.put(new Address("Minsk", 2, "Street22", 11), new Person("Alex", "Ivanov", 33 ));
        System.out.println(map);
        System.out.println(map.get(new Address("Minsk", 1, "Street", 1)));
        for (Map.Entry<Address, Person> entry : map.entrySet()) {
            if (entry.getValue().equals(new Person("Ivan", "Ivanov", 23 ))) {
                System.out.println(entry.getKey());
            }
        }
    }
}
