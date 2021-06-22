package leetcode;

public class XO {
    public static boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            final String curr = String.valueOf(str.charAt(i));
            if ("o".equalsIgnoreCase(curr)) {
                oCounter++;
                continue;
            }
            if ("x".equalsIgnoreCase(curr)) {
                xCounter++;
            }
        }

        return oCounter == xCounter;
    }

}
