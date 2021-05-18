package lesson17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App02 {
    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>();
        mouseList.add(null);
        mouseList.add(new Mouse());

        mouseList.sort(Comparator.naturalOrder());
    }
}
