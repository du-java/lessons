package lesson26;

import java.time.LocalDate;

public class Test {
    private String name;
    private LocalDate date;
    private double mark;

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + "," + date + "," + mark;
    }
}
