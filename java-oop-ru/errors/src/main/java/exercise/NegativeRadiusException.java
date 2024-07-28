package exercise;

public class NegativeRadiusException extends Exception {
  String error;

  public NegativeRadiusException(String error) {
    this.error = error;
  }
}
