package exercise;

// BEGIN
public class App {

  private final Circle circle;

  public App(Circle circle) {
    this.circle = circle;
  }

  public static void printSquare(Circle circle) {
    try {
      System.out.println(Math.round(circle.getSquare()));
    } catch (NegativeRadiusException exception) {
      System.out.println("Не удалось посчитать площадь");
    } finally {
      System.out.println("Вычисление окончено");
    }
  }
}
