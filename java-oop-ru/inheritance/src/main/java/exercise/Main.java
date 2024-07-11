package exercise;

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Tag img = new SingleTag("img", Map.of("class", "v-10", "id", "wop"));
    System.out.println(img);

    Tag p = new PairedTag(
        "p",
        Map.of("id", "abc"),
        "Text paragraph",
        List.of(
            new SingleTag("br", Map.of("id", "s")),
            new SingleTag("hr", Map.of("class", "a-5", "span", "234"))
        )
    );
    System.out.println(p);
  }

}
