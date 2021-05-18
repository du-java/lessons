package lesson17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App01 {
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

        String str = "09_10_11";
        String str1 = "12_01_02";
        String mm = LocalDate.of(2020, 1, 1).format(DateTimeFormatter.ofPattern("MM"));
        System.out.println(str.contains("01"));
        System.out.println(str1.contains("01"));
        System.out.println(str1.contains(mm));
    }
}
