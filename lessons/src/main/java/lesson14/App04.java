package lesson14;

import java.util.HashMap;

public class App04 {

    public static void main(String[] args) {

        NewString string1 = new NewString("String");
        NewString string2 = new NewString("StriNg");

        System.out.println(string1.hashCode() == string2.hashCode());
        System.out.println(string1.equals(string2));

        HashMap<NewString, String> map = new HashMap<>();

        map.put(string1, "String1");
        String string21 = map.put(string2, "String2");
        System.out.println(string21);

    }

}
