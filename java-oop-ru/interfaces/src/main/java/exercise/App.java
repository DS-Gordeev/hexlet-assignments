package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static List<String> buildApartmentsList(List<Home> apartments, int quantity) {
    List<Home> sortedApartments = apartments.stream().sorted(Home::compareTo).toList();
    List<String> result = new ArrayList<>();
    if (!sortedApartments.isEmpty()) {
      for (int i = 0; i < quantity; i++) {
        result.add(sortedApartments.get(i).toString());
      }
    }
    return result;
  }
}
