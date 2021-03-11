package lesson09;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ManualCreateArrayMenu {
    static void showMenu(Scanner scanner){
        int size = ArrayUtil.getInt(scanner,"size");
        int value = ArrayUtil.getInt(scanner, "Max value");
        int[] array = ArrayUtil.array(size);
    }

}
