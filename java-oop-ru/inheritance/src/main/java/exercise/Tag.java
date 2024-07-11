package exercise;

import java.util.Map;

public abstract class Tag {

  public final String tagName;
  public final Map<String, String> mapOfAttributes;

  public Tag(String tagName, Map<String, String> mapOfAttributes) {
    this.tagName = tagName;
    this.mapOfAttributes = mapOfAttributes;
  }

  public String getTagName() {
    return tagName;
  }

  public Map<String, String> getMapOfAttributes() {
    return mapOfAttributes;
  }

  public abstract String toString();

}
