package lesson25;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.Arrays;

public class App02 {
    public static void main(String[] args) {
        final Tyre nokian1 = new Tyre(13, "Nokian");
        final Tyre nokian2 = new Tyre(14, "Nokian");
        final Tyre nokian3 = new Tyre(15, "Nokian");
        final Tyre nokian4 = new Tyre(16, "Nokian");
        final Car audi = new Car(new Engine(123, "98"), "audi", BigDecimal.TEN,
                Arrays.asList(nokian1, nokian2, nokian3, nokian4));

        final JSONObject jsonObject = new JSONObject(audi);

        final DocumentContext context = JsonPath.parse(jsonObject.toString());
        final Object read = context.read("$.*");
        final String name = context.read("$.name");
        final BigDecimal price = new BigDecimal(context.read("$.price").toString());
        final int power = Integer.parseInt(context.read("$.engine.power").toString());
        final int size = Integer.parseInt(context.read("$.tyreList[2].size").toString());

        System.out.println();
    }
}
