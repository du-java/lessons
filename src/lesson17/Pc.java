package lesson17;

public class Pc extends Computer  {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    @Override
    public int compareTo(Computer computer) {

        if (computer instanceof Pc) {
            Pc pc = (Pc) computer;
            return this.monitor.compareTo(pc.monitor);
        }
        throw new IllegalArgumentException();
    }
}
