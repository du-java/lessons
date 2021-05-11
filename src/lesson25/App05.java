package lesson25;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App05 {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"engine\":{\"power\":123,\"power1\":123,\"type\":\"98\"},\"name\":\"audi\",\"price\":10,"
                + "\"tyre_list\":{\"size\":13,\"brand\":\"Nokian\"}}";

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

//        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);

        final Car car = objectMapper.readValue(json, Car.class);

        System.out.println(car);


    }
}
