package lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pc> pc = new ArrayList<>();
        pc.sort(new FrecCpuPcComparator());
        pc.sort(new RamPcComparator());
        pc.sort(new Comparator<Pc>() {
            @Override
            public int compare(Pc o1, Pc o2) {
                return o1.getCpu().getModelName().compareTo(o2.getCpu().getModelName());
            }
        });
    }
}
