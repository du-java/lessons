package lesson24;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class App03 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(final String[] args) {
//        Locale.setDefault(new Locale("ru", "RU"));
//        Locale.setDefault(Locale.CANADA_FRENCH);

        if (args.length > 0) {
            Locale.setDefault(Locale.forLanguageTag(args[0]));
        }

        while (true) {
            System.out.println("App i18n");
            System.out.printf("1 - %s\n", getString("addMsg"));
            System.out.printf("2 - %s\n", getString("showAll"));
            System.out.printf("3 - %s\n", getString("delMsg"));
            System.out.printf("0 - %s\n", getString("exit"));
            if (SCANNER.nextInt() == 0) {
                return;
            }
        }
    }

    private static String getString(final String key) {
        try {
            final ResourceBundle bundle = ResourceBundle.getBundle("msg");
            return new String(bundle.getString(key).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        } catch (MissingResourceException ex) {
            return ResourceBundle.getBundle("msg", Locale.US).getString(key);
        }
    }
}
