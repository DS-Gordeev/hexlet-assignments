package exercise;

public class Circle {

  private final Point point;
  private final int radius;

  public Circle(Point point, int radius) {
    this.point = point;
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public double getSquare() throws NegativeRadiusException {
    var square = Math.PI * radius * radius;
    if (radius < 0) {
      throw new NegativeRadiusException("Радиус не может быть отрицательным");
    }
    return square;
  }
}

