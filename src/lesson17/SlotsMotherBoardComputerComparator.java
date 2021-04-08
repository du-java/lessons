package lesson17;

import java.util.Comparator;

public class SlotsMotherBoardComputerComparator  implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        return o1.getMotherboard().compareTo(o2.getMotherboard());
    }
}
