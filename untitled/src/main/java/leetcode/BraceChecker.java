package leetcode;

import java.util.HashMap;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
 * <p>
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!
 * <p>
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * What is considered Valid?
 * <p>
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * <p>
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */

public class BraceChecker {

    private static final String BRACES_CIRCLE = "()";
    private static final String BRACES_CURLY = "{}";
    private static final String BRACES_SQUARE = "[]";

    public boolean isValid(String braces) {
        final HashMap<String, Integer> map = new HashMap<>();
        map.put(BRACES_CIRCLE, 0);
        map.put(BRACES_CURLY, 0);
        map.put(BRACES_SQUARE, 0);

        final String[] arrayBraces = braces.split("");
        for (int i = 0; i < arrayBraces.length; i++) {
            int count = 0;
            final String curr = arrayBraces[i];
            String next = null;
            if (i < arrayBraces.length - 1) {
                next = arrayBraces[i + 1];
            }
            switch (curr) {
                case "(":
                    if (next != null && "){[".contains(next)) {
                        count = map.get(BRACES_CIRCLE);
                        map.put(BRACES_CIRCLE, ++count);
                        continue;
                    }
                    return false;
                case "{":
                    if (next != null && "}([".contains(next)) {
                        count = map.get(BRACES_CURLY);
                        map.put(BRACES_CURLY, ++count);
                        continue;
                    }
                    return false;
                case "[":
                    if (next != null && "]{(".contains(next)) {
                        count = map.get(BRACES_SQUARE);
                        map.put(BRACES_SQUARE, ++count);
                        continue;
                    }
                    return false;
                case "]":
                    count = map.get(BRACES_SQUARE) - 1;
                    if (count < 0 || count % 2 != 0) {
                        return false;
                    }
                    map.put(BRACES_SQUARE, count);
                    break;
                case ")":
                    count = map.get(BRACES_CIRCLE) - 1;
                    if (count < 0 || count % 2 != 0) {
                        return false;
                    }
                    map.put(BRACES_CIRCLE, count);
                    break;
                case "}":
                    count = map.get(BRACES_CURLY) - 1;
                    if (count < 0 || count % 2 != 0) {
                        return false;
                    }
                    map.put(BRACES_CURLY, count);
                    break;
            }
        }
        return map.values().stream().noneMatch(x -> x < 0 || x % 2 != 0);
    }
}
