package lesson12;

import java.util.Locale;

public class App01 {
    public static void main(String[] args) {
        Door door = new Door();

        door.equals(door);

        DoorState doorState1 = door.getState();
        door.setState(DoorState.CLOSE);
        DoorState doorState2 = door.getState();
        door.setState(DoorState.OPEN);

        if (door.getState() == DoorState.OPEN) {
            door.setState(DoorState.CLOSE);
        }

        Month january = Month.valueOf("january".toUpperCase(Locale.ROOT));
        switch (january) {
            case JANUARY:
            case FEBRUARY:
                System.out.println("winter");
                break;
            case MARCH:
                System.out.println("spring");
        }

        System.out.println(january.getShortMonth());

    }
}
