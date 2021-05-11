package lesson25;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.json.JSONObject;

public class App06 {
    public static void main(String[] args) throws JsonProcessingException {
        Laptop lenovo = new Laptop("Lenovo", 35);
        JSONObject jsonObject = new JSONObject(lenovo);
        int size = jsonObject.getInt("size");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(lenovo);
        Laptop laptop = objectMapper.readValue(s, Laptop.class);
        System.out.println(laptop);
    }
}
