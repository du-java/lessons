package lesson19;

import java.time.LocalDate;

public class Student {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String group;
    private double weight;
    private long height;

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", group='" + group + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String csv() {
        return firstname + ',' + lastname + ',' + birthday +','+ group +','+ weight +','+ height;
    }

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

    public Student() {
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(long height) {
        this.height = height;
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
