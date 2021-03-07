package lesson03;

public class App01 {
    public static void main(String[] args) {

        int v1 = 10;
        System.out.println(v1++);
        System.out.println(++v1);
        System.out.println(v1--);
        System.out.println(--v1);

        int v2 = 10;
        v2 = v2 + 1; // v2 += 1 v2++

        v2 %= 2;
        System.out.println(v2);

        v2 = 11;
        v2 /= 3;
        System.out.println(v2);
    }
}
