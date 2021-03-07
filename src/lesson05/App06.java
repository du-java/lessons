package lesson05;

import java.util.Arrays;

public class App06 {
    public static void main(String[] args) {
        int[] delArray = del(100, 120, 13);
        System.out.println(Arrays.toString(delArray));
        System.out.println(Arrays.toString(del(delArray)));

        System.out.println(Arrays.toString(del(100, 101, 13)));

        int[] array = new int[100];
        fillToEnd(array, 50);
        System.out.println(Arrays.toString(array));
    }

    /// [1,2,3,4,5,0,0,0,0] => [1,2,3,4,5]
    static int[] del(int[] array) {
        int size = 0;
        for (int i : array) {
            if (i > 0) size++;
        }

        int[] newArray = new int[size];
//        for (int i = 0, count = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                newArray[count++] = array[i];
//            }
//        }

        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }

    static int[] del(int start, int end, int x) {
        int[] array = new int[end - start];

        for (int i = start, count = 0; i <= end; i++) {
            if (i % x == 0) {
                array[count++] = i;
            }
        }

        return array;
    }

    static void fillToEnd(int[] array, int end) {
        for (int i = 0; i < array.length; i++) {
            if (end == i) return;
            array[i] = i;
        }
    }
}
