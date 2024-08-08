package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {

  public static List<String> validate(Address address) {
    List<String> notValidatedFields = new ArrayList<>();
    try {
      Field[] fields = address.getClass().getDeclaredFields();
      for (Field field : fields) {
        field.setAccessible(true);
        if (field.isAnnotationPresent(NotNull.class) && field.get(address) == null) {
          notValidatedFields.add(field.getName());
        }
      }
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return notValidatedFields;
  }
}
