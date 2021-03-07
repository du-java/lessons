package lesson03;

public class App03 {
    public static void main(String[] args) {
        if (true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        int x = 123, y = 23;

        if ((x - y) > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        if (y - x > 0) System.out.println("positive");
        System.out.println("negative");

        if ((x - y) > 0)
            System.out.println("positive");
        else
            System.out.println("negative");
        System.out.println("negative");


    }
}
