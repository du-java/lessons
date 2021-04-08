package lesson17;

import java.util.Comparator;

public class RamPcComparator implements Comparator<Pc> {
    @Override
    public int compare(Pc o1, Pc o2) {
        return o1.getRam() - o2.getRam();
    }
}
