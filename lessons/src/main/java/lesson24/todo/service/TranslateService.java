package lesson24.todo.service;

import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

public class TranslateService {
    public static String getString(String key){
   //     try {
            final ResourceBundle bundle = ResourceBundle.getBundle("todo");
            return new String(bundle.getString(key).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
       /* } catch (MissingResourceException ex) {
            return ResourceBundle.getBundle("lesson24.todo", Locale.US).getString(key);
        }*/
    }
}
