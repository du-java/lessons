package lesson25;

public class Computer implements Comparable<Computer> {
    private String name;
    private Cpu cpu;
    private Motherboard motherboard;
    private int ram;

    @Override
    public int compareTo(Computer o) {
        return this.name.compareTo(o.name);
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public int getRam() {
        return ram;
    }
}
