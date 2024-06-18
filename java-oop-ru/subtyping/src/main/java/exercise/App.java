package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App {

  public static void swapKeyValue(KeyValueStorage storage) {
    List<Entry<String, String>> entries = new ArrayList<>(storage.toMap().entrySet());
    storage.eraseDb();
    for (Map.Entry<String, String> entry : entries) {
      if(!storage.toMap().containsKey(entry.getValue())) {
        storage.set(entry.getValue(), entry.getKey());
      }
    }
  }
}
