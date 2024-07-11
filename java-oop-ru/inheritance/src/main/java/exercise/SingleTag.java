package exercise;

import java.util.Map;

public class SingleTag extends Tag {

  public SingleTag(String tagName, Map<String, String> mapOfAttributes) {
    super(tagName, mapOfAttributes);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    for (var entry : super.getMapOfAttributes().entrySet()) {
      builder
          .append(" ")
          .append(entry.getKey())
          .append("=")
          .append("\"")
          .append(entry.getValue())
          .append("\"");
    }

    String result = builder.toString();
    return String.format("<%s%s>", getTagName(), result);
  }
}

