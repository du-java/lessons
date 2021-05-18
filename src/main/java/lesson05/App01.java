package lesson05;

public class App01 {
    public static void main(String[] args) {

        int x = 1, y = 1;
        int d = 2;

        int z1 = sum(x, y);
        int z2 = sum(x, y);
        int z3 = sum(x, y);
        int z4 = sum(x, y);
        int z5 = sum(x, y) + 1;
        int z6 = sum(x, y);
        int z7 = sum(x, y);
        int z8 = sum(x, y);

        System.out.println(x);
    }

    static int sum(int x, int y) {
        x++;
        int i = x + y;
        i += 2;
        return i;
    }
}
