package lesson17;

import java.util.Comparator;

public class GenCpuComparator implements Comparator<Cpu> {
    @Override
    public int compare(Cpu cpu1, Cpu cpu2) {
        return cpu1.getGeneration() - cpu2.getGeneration();
    }
}
