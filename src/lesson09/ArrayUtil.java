package lesson09;

import java.util.Scanner;

public class ArrayUtil {
    static int getInt(Scanner scanner, String msg){
        System.out.println(msg);
        return scanner.nextInt();
    }
    static int[] array(int size){
        return new int[size];
    }
    static int getElementOfArray(Scanner scanner, int max){
        int finish;
        do{
            finish = getInt(scanner, "write number");
        } while( finish>=max);
        return finish;
    }
}
