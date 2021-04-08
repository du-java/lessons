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


        List<Cpu> cpus = new ArrayList<>();

        GenCpuComparator genCpuComparator = new GenCpuComparator();
        cpus.sort(genCpuComparator); // genCpuComparator.compare(cpus.get(0), cpus.get(1))
//        cpus.sort(Comparator.naturalOrder());


        List<Integer> asd = new ArrayList<>();
        asd.sort(Comparator.naturalOrder());


        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("l1", 15));
        laptops.add(new Laptop("l3", 16));
        laptops.add(new Laptop("l2", 17));

        laptops.sort(Comparator.naturalOrder());

        System.out.println(laptops);

    }
}
