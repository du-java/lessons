package lesson12.doors;

public class DoorsFactory {
    public static Doors createDoors(Doors.State type){
        switch (type){
            case OPEN:
                Doors doors1 = new Doors(Doors.State.OPEN);
                return doors1;
                case CLOSE:
                    Doors doors2 = new Doors(Doors.State.CLOSE);
                    return doors2;
        }
        throw new RuntimeException();
    }
}
