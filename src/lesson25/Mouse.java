package lesson25;

public class Mouse implements Comparable<Mouse> {
    private String name;
    private int buttons;

    @Override
    public int compareTo(Mouse o) {
        return name.compareTo(o.name);
    }
}
