package lesson17;

public class Laptop extends Computer {
    private String name;
    private int size;

    public Laptop(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Computer comp) {
        if (comp.getClass() == Laptop.class) {
            Laptop laptop = (Laptop) comp;
            return name.compareTo(laptop.name);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
