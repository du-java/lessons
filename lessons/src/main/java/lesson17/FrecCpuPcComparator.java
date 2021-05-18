package lesson17;

import java.util.Comparator;

public class FrecCpuPcComparator implements Comparator<Pc> {
    @Override
    public int compare(Pc o1, Pc o2) {
        return o1.getCpu().getFrequency() - o2.getCpu().getFrequency();
    }
}
