package lesson25;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.Arrays;

public class App01 {
    public static void main(String[] args) {
        final Tyre nokian = new Tyre(15, "Nokian");
        final Car audi = new Car(new Engine(123, "98"), "audi", BigDecimal.TEN,
                Arrays.asList(nokian, nokian, nokian, nokian));

        final JSONObject jsonObject = new JSONObject(audi);

        System.out.println(jsonObject);
        final String json = jsonObject.toString();

        final JSONObject jsonAudi = new JSONObject(json);
        final String name = jsonAudi.getString("name");
        final JSONObject engine = jsonAudi.getJSONObject("engine");
        final int power = engine.getInt("power");
        final String type = engine.getString("type");
        final BigDecimal price = jsonAudi.getBigDecimal("price");
        final JSONArray tyreList = jsonAudi.getJSONArray("tyreList");

        System.out.println();
    }
}
