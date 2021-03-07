package lesson03;

import java.util.Random;

public class App05 {
    public static void main(String[] args) {
        int i = new Random().nextInt(10) + 1; // 1..10
        System.out.println(i);
    }
}

