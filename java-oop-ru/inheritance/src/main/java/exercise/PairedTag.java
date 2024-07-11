package exercise;

import java.util.List;
import java.util.Map;

public class PairedTag extends Tag {

  private final String tagText;
  private final List<Tag> innerTags;

  public String getTagText() {
    return tagText;
  }

  public PairedTag(String tagName, Map<String, String> mapOfAttributes, String tagText,
      List<Tag> innerTags) {
    super(tagName, mapOfAttributes);
    this.tagText = tagText;
    this.innerTags = innerTags;
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

    StringBuilder builderInner = new StringBuilder();
    for (var oneTag : innerTags) {
      builderInner.append(oneTag.toString());
    }
    String innerResult = builderInner.toString();

    return String.format("<%s%s>%s%s</%s>", getTagName(), result, getTagText(), innerResult, getTagName());
  }
}
