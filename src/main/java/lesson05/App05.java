package lesson05;

public class App05 {
    public static void main(String[] args) {
        int res = mutiply(1, 2, 3, 3, 5434, 5, 346, 45, 645, 6);


        int[][] matrix = new int[1][1];

        int[] matrix1 = matrix[1];

        System.out.println(res);
    }

    static int mutiply(int... ints) { // int[] ints = new ints[...] {1 ,2 ,3 ,4}
        int res = 0;
        for (int a : ints) {
            res *= a;
        }
        return res;
    }

}
