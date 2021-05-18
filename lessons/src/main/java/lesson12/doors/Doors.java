package lesson12.doors;

public class Doors {
    enum State{
        OPEN,
        CLOSE
    }
    private State state;

    public Doors(State state) {
        this.state = state;
    }

}
