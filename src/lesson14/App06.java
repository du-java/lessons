package lesson14;

import java.util.*;

public class App06 {
    public static void main(String[] args) {
        Map<Person, List<Address>> map = new HashMap<>();
        List<Address> list = new ArrayList<>();
        list.add(new Address("Minsk", 2, "Street22", 11));

        Person person = new Person("Ivan", "Ivanov", 23 );
        map.put(person,list);
        System.out.println(map);
        List<Address> addresses = map.get(person);
        addresses.add(new Address("Minsk", 2, "Street22", 11));
        map.put(person, addresses);
        System.out.println(map);

    }
}
