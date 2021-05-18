package lesson25;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class App07 {
    public static void main(String[] args) throws JsonProcessingException {
        Pc pc = new Pc();
        Monitor dell = new Monitor();
        dell.setName("Dell");
        dell.setScreenSize(21);
        pc.setMonitor(dell);
        ObjectMapper objectMapper = new ObjectMapper();
      //  objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
        String s = objectMapper.writeValueAsString(pc);
        System.out.println(s);
        Pc pc1 = objectMapper.readValue(s, Pc.class);
        System.out.println(pc1);
    }
}
