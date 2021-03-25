package lesson13.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App04 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("1");
        stringList.add("3");
        stringList.add("1");
        stringList.add("1");
        stringList.add("2");
        stringList.add("5");
        stringList.add("4");
        stringList.add("1");

        System.out.println(stringList.toString());

        System.out.println(stringList.get(4));

        String el = null;
        for (String str : stringList) {
            System.out.println(str);
            if (str.equals("2")) el = str;

        }
        stringList.remove(el);
        System.out.println(stringList);

        stringList.add("2");
        System.out.println(stringList);

        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("2")) iterator.remove();
        }

        System.out.println(stringList);

        stringList.sort(Comparator.naturalOrder());

        System.out.println(stringList);



    }
}
