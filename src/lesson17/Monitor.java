package lesson17;

public class Monitor implements Comparable <Monitor>  {
    private String name;
    private int screenSize;

    @Override
    public int compareTo(Monitor o) {
        return this.screenSize - o.screenSize;
    }
}
