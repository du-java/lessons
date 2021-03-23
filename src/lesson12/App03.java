package lesson12;

public class App03 {
    public static void main(String[] args) {

        Integer integer = new Integer(1);
        integer = Integer.valueOf(1);
        integer = Integer.valueOf("1");
        integer = Integer.parseInt("1");
//        integer = Integer.parseInt("1s");

        integer++;

        System.out.println(integer);

        Integer integer2 = new Integer(2);

        System.out.println(integer == integer2);
        System.out.println(integer.equals(integer2));

    }
}
