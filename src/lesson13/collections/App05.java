package lesson13.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App05 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrey", "Kotov", 25, new Address(5)));
        people.add(new Person("Anton", "Vorobey", 15, new Address(3)));
        people.add(new Person("Vladimir", "Zotov", 35, new Address(7)));

        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
        people.sort(Comparator.naturalOrder());
        System.out.println(people);
        people.sort(Comparator.reverseOrder());
        System.out.println(people);
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        });
        System.out.println(people);


        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddress().getNumber() - o2.getAddress().getNumber();
            }
        });
        System.out.println(people);

    }
}
