package lesson26;

import java.util.List;

public class Student {
    private String login;
    private String group;
    private List<Test> tests;
    private String firstname;
    private String lastname;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public Student(String login, List<Test> tests) {
        this.login = login;
        this.tests = tests;
    }

    public String getLogin() {
        return login;
    }

    public List<Test> getTests() {
        return tests;
    }

    @Override
    public String toString() {
        return id + "," +login + "," + group + "," + firstname + "," + lastname + "," + tests;
    }
}
