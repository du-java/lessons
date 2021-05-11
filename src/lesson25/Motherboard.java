package lesson25;

public class Motherboard implements Comparable<Motherboard> {
    private int slots;

    public int getSlots() {
        return slots;
    }

    @Override
    public int compareTo(Motherboard o) {
        return this.slots - o.slots;
    }
}
