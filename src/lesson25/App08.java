package lesson25;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App08 {
    public static void main(String[] args) throws JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();
        final Mouse logi = Mouse.builder()
                .withName("logi")
                .withButtons(3)
                .build();

        final String json = objectMapper.writeValueAsString(logi);
        final Mouse mouse = objectMapper.readValue(json, Mouse.class);

        System.out.println(mouse);
    }
}
