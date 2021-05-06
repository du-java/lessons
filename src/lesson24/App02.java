package lesson24;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class App02 {
    public static void main(String[] args) {

        final Currency currency = Currency.getInstance(Locale.getDefault());
        System.out.println(currency);
        System.out.println(Currency.getInstance(Locale.CHINA));

        System.out.println(Arrays.toString(Currency.getAvailableCurrencies().toArray()));
    }
}
