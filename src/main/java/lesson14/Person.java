package lesson14;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public String getFirstname() {
        return firstname;
    }



    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }
}
