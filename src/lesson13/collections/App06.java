package lesson13.collections;

import java.util.*;

public class App06 {
    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();

        people.add(new Person("Andrey", "Kotov", 25, new Address(5)));
        people.add(new Person("Anton", "Vorobey", 15, new Address(3)));
        people.add(new Person("Vladimir", "Zotov", 35, new Address(7)));
        people.add(new Person("Vladimir", "Zotov", 35, new Address(7)));

        System.out.println(people);

        for (Person person : people) {
            System.out.println(person);
        }

        people.remove(new Person("Vladimir", "Zotov", 35, new Address(7)));
        System.out.println(people);

        SortedSet<Address> sortedSet1 = new TreeSet<>();
        SortedSet<Person> sortedSet = new TreeSet<>();

        sortedSet.add(new Person("Andrey", "Kotov", 25, new Address(5)));
        sortedSet.add(new Person("Anton", "Vorobey", 15, new Address(3)));
        sortedSet.add(new Person("Vladimir", "Zotov", 35, new Address(7)));
        sortedSet.add(new Person("Vladimir", "Zotov", 35, new Address(7)));

        System.out.println(sortedSet);

        TreeSet<Person> people1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });
        people1.add(new Person("Andrey", "Kotov", 25, new Address(5)));
        people1.add(new Person("Anton", "Vorobey", 15, new Address(3)));
        people1.add(new Person("Vladimir", "Zotov", 35, new Address(7)));
        people1.add(new Person("Vladimir", "Zotov", 35, new Address(7)));
        System.out.println(people1);


        List<Person> people2 = new ArrayList<>(people);
        Set<Person> people3 = new HashSet<>(people2);
        Integer[] ints = new Integer[5];
        List<Integer> integers = new ArrayList<>(Arrays.asList(ints));

    }
}
