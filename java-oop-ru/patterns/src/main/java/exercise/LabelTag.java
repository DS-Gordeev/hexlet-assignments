package exercise;

public class LabelTag implements TagInterface {

  private final String labelText;
  public final TagInterface otherTag;

  public LabelTag(String labelText, TagInterface otherTag) {
    this.labelText = labelText;
    this.otherTag = otherTag;
  }

  public String getLabelText() {
    return labelText;
  }

  @Override
  public String render() {
    String innerTag = otherTag.render();
    return String.format("<label>%s%s</label>", getLabelText(), innerTag);
  }
}
