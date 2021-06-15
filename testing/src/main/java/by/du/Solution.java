package by.du;

public class Solution {

    /**
     * input: int = 123456
     * output: int = 162534
     */

    public static int solution(int given) {
        String value = String.valueOf(given);
        String[] digits = value.split("");
        StringBuilder reversGiven = new StringBuilder(value ).reverse();
        String[] reversDigits = reversGiven.toString().split("");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
                builder.append(digits[i]);
            if (builder.length() == digits.length) break;
            builder.append(reversDigits[i]);
            if (builder.length() == digits.length) break;
        }
        return Integer.parseInt(builder.toString());
    }
}
