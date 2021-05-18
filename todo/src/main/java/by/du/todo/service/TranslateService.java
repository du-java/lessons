package by.du.todo.service;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class TranslateService {
    public static String getString(String key){
   //     try {
            final ResourceBundle bundle = ResourceBundle.getBundle("todo");
            return new String(bundle.getString(key).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
       /* } catch (MissingResourceException ex) {
            return ResourceBundle.getBundle("todo", Locale.US).getString(key);
        }*/
    }
}
