package by.du;

public class Solution {

    /**
     * input: int = 123456
     * output: int = 162534
     */

    public static int solution(int given) {
        String[] digits = String.valueOf(given).split("");

        StringBuilder builder = new StringBuilder();

//        int half = digits.length / 2;
//        if (digits.length % 2 != 0) {
//            half++;
//        }

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 != 0) {
                if (i > (digits.length - i - 1)) break;
                builder.append(digits[digits.length - i]);
                builder.append(digits[i]);
            }
            if (i % 2 == 0) {
                if (i > digits.length / 2) break;
                builder.append(digits[i]);
            }

        }

        return Integer.parseInt(builder.toString());
    }
}
