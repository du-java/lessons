package lesson12.doors;

public class DoorFactory {

    public static Door getDoor(boolean isOpen) {
        return new Door(isOpen);
    }

}
