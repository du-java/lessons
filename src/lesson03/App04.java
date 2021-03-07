package lesson03;

import java.util.Random;

public class App04 {
    public static void main(String[] args) {

        // x Четное или нет?

        int x = 4;

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


        // y  / 5, 50 < x < 100

        // x 1..7

        // x 1..7, if Mon, Wed, Fri, Sat, Sun == free

        x = 12;

        if (x % 2 != 0 || x == 6) {
            System.out.println("free");
        }
        switch (x) {
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
                System.out.println("free");
        }
        // x 1..12 winter, spring, summer, fall

        String str = "spring";

        switch (str){
            case "spring":
                System.out.println("3..5");
        }


        switch (x) {
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
        }


        // расстоние y, скорость 1го x1, скорость 2го x2, z = ? (через сколько встретятся)

        // car1 x1, car 2 x2, t - time, z = distance





    }
}
