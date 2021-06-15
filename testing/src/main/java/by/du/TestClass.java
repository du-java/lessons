package by.du;

public class TestClass {

    public int sum(int x, int y) {
        return x + y;
    }

    public int max(int x, int y) {
        return Math.max(x, y);
    }

    public boolean isEven(int x) {
        if (x <= 0) throw new IllegalArgumentException();
        return x % 2 == 0;
    }
}
