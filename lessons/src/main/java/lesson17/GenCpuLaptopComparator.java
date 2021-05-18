package lesson17;

import java.util.Comparator;

public class GenCpuLaptopComparator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getCpu().getGeneration()-o2.getCpu().getGeneration();
    }
}
