package lesson09;

import java.util.Arrays;
import java.util.Scanner;

public class ManualCreateArrayMenu {
    static void showMenu(Scanner scanner){
        int size = ArrayUtil.getInt(scanner,"size");
        int value = ArrayUtil.getInt(scanner, "Max value");
        int[] array = ArrayUtil.createManualFilledArray(size,value,scanner);
        ArrayUtil.printArray(array);



    }

}
