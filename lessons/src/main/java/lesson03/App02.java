package lesson03;

public class App02 {
    public static void main(String[] args) {

        int v1 = 123, v2 = 234;
        boolean b = v1 > v2;
        System.out.println(b);

        boolean b1 = v2 > v1;
        boolean b2 = !b;
        System.out.println(b2);

        boolean b3 = v1 == v2;
        boolean b4 = v1 != v2;
        boolean b5 = !(v1 == v2);

        boolean b6 = v1 > 100 && prn1(v2); // == true
        System.out.println(b6);

        boolean b7 = v1 < 100 && prn2(v2); // == false
        System.out.println(b6);

        boolean b8 = v1 < 100 & prn2(v2); // == false
        System.out.println(b6);

        boolean b9 = v1 <= 123 || v2 < 250 /* true */;
        System.out.println(b9);

        boolean b10 = (v1 == 100 || v2 < 250)
                && !(v2 > 250 && v2 < 123)
                || (v1 > 123);
    }

    private static boolean prn1(int v2) {
        System.out.println("_1");
        return v2 < 250;
    }

    private static boolean prn2(int v2) {
        System.out.println("_2");
        return v2 < 250;
    }
}
