package lesson19;

import java.time.LocalDate;

public class Student {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String group;
    private double weight;
    private long height;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getGroup() {
        return group;
    }

    public double getWeight() {
        return weight;
    }

    public long getHeight() {
        return height;
    }

    public Student(String firstname, String lastname, LocalDate birthday, String group, double weight, long height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.group = group;
        this.weight = weight;
        this.height = height;
    }
}
