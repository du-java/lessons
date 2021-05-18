package lesson17;

public class Monitor implements Comparable <Monitor>  {
    private String name;
    private double screenSize;

    @Override
    public int compareTo(Monitor o) {
        return (int) (this.screenSize - o.screenSize);
    }
}
