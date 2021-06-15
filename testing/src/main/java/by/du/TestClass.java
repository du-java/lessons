package by.du;

public class TestClass {

    public int sum(int x, int y) {
        return x + y;
    }

    public int max(int x, int y) {
        return Math.max(x, y);
    }

    public boolean doIt(int x) {
        if (x <= 0) throw new IllegalArgumentException();
        if (x % 2 == 0) return true;
        else {
            return false;
        }

    }
}
