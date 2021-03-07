package lesson07;

public class App01 {
    public static void main(String[] args) {
        String str = "";
        String str1 = "";
        str += "1";

        System.out.println(str);

        boolean equals = str.equals(str1);

        String str3 = "Hello";
        String str4 = "hello";

        str3.equalsIgnoreCase(str4);

        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            strB.append(i);
        }
        String str5 = strB.toString();

        String str6 = "Warren G. Harding (1865–1923) was the 29th president of the United States, serving from March 4, 1921, until his death in 1923. A member of the Republican Party, Harding was defeated for Governor of Ohio in 1910, but was elected to the Senate in 1914. He ran for the Republican nomination for president in 1920. Considered a long shot until after the convention began, he was nominated on the tenth ballot. He conducted a front porch campaign, running on the theme of a return to normalcy, and won in a landslide, the first sitting senator to be elected president. He appointed a number of well-regarded figures to his cabinet, including Andrew Mellon at the Treasury Department, Herbert Hoover at Commerce, and Charles Evans Hughes at State. After his death in San Francisco, a number of scandals, including Teapot Dome, came to light, as did his extramarital affair with Nan Britton, eroding his popular regard. Harding was succeeded by Vice President Calvin";
        int length = str6.length();
        boolean president = str6.contains("president");
        String[] split = str6.split(" ");

        int counter = 0;
        int start = 0;
        do {
            start = str6.indexOf("at", start) + 1;
            counter++;
        } while (str6.indexOf("at", start) > 0);
        System.out.println(counter);

        String str7 = "Hello";
        String str8 = str7;

        boolean a1 = str8 == str7;
        boolean a2 = str8.equals(str7);
        str8 = new String(str8);

        boolean a3 = str8 == str7;
        boolean a4 = str8.equals(str7);

        str8 = str8.intern();

        boolean a5 = str8 == str7;
        boolean a6 = str8.equals(str7);


        StringBuilder strB1 = new StringBuilder();

        String replaceAll = "+375 12 123-45-67".replaceAll("\\D*", "");
        System.out.println(replaceAll);
    }
}
