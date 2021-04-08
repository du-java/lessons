package lesson17;

import java.util.Comparator;

public class DoorsCarsComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        return o1.getDoors()-o2.getDoors();
    }

}
