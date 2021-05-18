package lesson25;

public class Pc extends Computer {

    public Keyboard getKeyboard() {
        return keyboard;
    }

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return super.toString() + "Pc{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitor=" + monitor +
                '}';
    }

    @Override
    public int compareTo(Computer computer) {
        if (computer instanceof Pc) {
            Pc pc = (Pc) computer;
            return this.monitor.compareTo(pc.monitor);
        }
        throw new IllegalArgumentException();
    }
}
