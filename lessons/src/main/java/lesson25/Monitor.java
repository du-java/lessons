package lesson25;

public class Monitor implements Comparable <Monitor>  {
    private String name;
    private double screenSize;

    public Monitor() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public int compareTo(Monitor o) {
        return (int) (this.screenSize - o.screenSize);
    }
}
