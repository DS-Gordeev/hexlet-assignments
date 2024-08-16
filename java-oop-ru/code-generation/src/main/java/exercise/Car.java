package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

@Value
class Car {

  int id;
  String brand;
  String model;
  String color;
  User owner;

  public String serialize() {
    try {
      final ObjectMapper mapper = new ObjectMapper();
      String result = mapper.writeValueAsString(this);
      return result;
    } catch (JsonProcessingException e) {
      throw new RuntimeException("Ошибка формирования JSON-строки");
    }
  }

  public static Car deserialize(String carJson) {
    try {
      final ObjectMapper mapper = new ObjectMapper();
      Car result = mapper.readValue(carJson, Car.class);
      return result;
    } catch (Exception e) {
      throw new RuntimeException("Ошибка формирования объекта Car из JSON-строки");
    }
  }
}
