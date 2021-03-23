package lesson12;

public class Door {
    private DoorState doorState;

    public DoorState getState() {
        return doorState;
    }

    public void setState(DoorState doorState) {
        this.doorState = doorState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        return doorState == door.doorState;
    }

    @Override
    public int hashCode() {
        return doorState != null ? doorState.hashCode() : 0;
    }
}
