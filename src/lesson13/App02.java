package lesson13;

import java.util.Arrays;

public class App02 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();

        stringBox.setArray(new String[]{"string1", "string2"});

        String[] strings = stringBox.getArray();
        System.out.println(Arrays.toString(strings));

    }
}
