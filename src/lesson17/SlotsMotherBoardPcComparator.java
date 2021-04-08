package lesson17;

import java.util.Comparator;

public class SlotsMotherBoardPcComparator implements Comparator<Pc> {

    @Override
    public int compare(Pc o1, Pc o2) {
        return o1.getMotherboard().compareTo(o2.getMotherboard());
    }
}
