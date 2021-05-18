package lesson14;

import java.util.*;
import java.util.function.Function;

public class App06 {
    public static void main(String[] args) {
        Map<Person, List<Address>> map = new HashMap<>();
        List<Address> list = new ArrayList<>();
        list.add(new Address("Minsk", 2, "Street22", 11));

        Person person = new Person("Ivan", "Ivanov", 23);
        map.put(person, list);
        System.out.println(map);
        List<Address> addresses = map.get(person);
        addresses.add(new Address("Minsk", 2, "Street22", 11));
        map.put(person, addresses);
        System.out.println(map);

        Map<Person, List<Address>> map1 = addAddress(
                map, new Person("", "", 0), new Address("", 1, "", 1)
        );
        System.out.println(map1);
    }

    public static Map<Person, List<Address>> addAddress(Map<Person, List<Address>> map, Person person, Address address) {
        map.computeIfAbsent(person, new Function<Person, List<Address>>() {
            @Override
            public List<Address> apply(Person person) {
                List<Address> addresses = new ArrayList<>();
                addresses.add(address);
                return addresses;
            }
        });

        return map;
    }

    public static Map<Person, List<Address>> addAddress1(Map<Person, List<Address>> map, Person person, Address address) {
        if (map.containsKey(person)) {
            List<Address> addresses = map.get(person);
            addresses.add(address);
            map.put(person, addresses);
            return map;
        }

        List<Address> list = new ArrayList<>();
        list.add(address);
        map.put(person, list);
        return map;
    }

    public static Map<Person, List<Address>> addAddress2(Map<Person, List<Address>> map, Person person, Address address) {
        List<Address> addresses = map.get(person);
        if (addresses != null) {
            addresses.add(address);
            map.put(person, addresses);
            return map;
        }

        List<Address> list = new ArrayList<>();
        list.add(address);
        map.put(person, list);
        return map;
    }
}
