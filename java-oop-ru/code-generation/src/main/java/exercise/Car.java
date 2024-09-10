package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value 
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public String serialize() {
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null; // или выбросить исключение
        }
    }

    public static Car deserialize(String json) {
        try {
            return objectMapper.readValue(json, Car.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
            return null; // или выбросить исключение
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null; // или выбросить исключение
        }
    }
    // END
}

