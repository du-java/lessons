package lesson17;

import java.util.Comparator;

public class SizeLaptopComparator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {

        return o1.getSize() - o2.getSize();
    }
}
