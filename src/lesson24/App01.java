package lesson24;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class App01 {
    public static void main(String[] args) {
        final Locale defaultLocale = Locale.getDefault();

        System.out.println(defaultLocale.getCountry());
        System.out.println(defaultLocale.getDisplayCountry());
        System.out.println(defaultLocale.getLanguage());
        System.out.println(defaultLocale.getDisplayLanguage());

        Locale.setDefault(new Locale("ru", "BY"));

        System.out.println(Locale.getDefault().getCountry());
        System.out.println(Locale.getDefault().getDisplayCountry());
        System.out.println(Locale.getDefault().getLanguage());
        System.out.println(Locale.getDefault().getDisplayLanguage());

        final Locale localeEnUk = Locale.forLanguageTag("en-GB");

        System.out.println(localeEnUk.getCountry());
        System.out.println(localeEnUk.getDisplayCountry());
        System.out.println(localeEnUk.getLanguage());
        System.out.println(localeEnUk.getDisplayLanguage());

        Locale canada = Locale.CANADA;

        System.out.println(canada.getCountry());
        System.out.println(canada.getDisplayCountry());
        System.out.println(canada.getLanguage());
        System.out.println(canada.getDisplayLanguage());

        System.out.println(Arrays.toString(Locale.getAvailableLocales()));

        final DateFormat dateFormatFrCa = DateFormat.getDateInstance(DateFormat.LONG, Locale.CANADA_FRENCH);
        System.out.println(dateFormatFrCa.format(new Date()));

        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINESE).format(new Date()));
    }
}
