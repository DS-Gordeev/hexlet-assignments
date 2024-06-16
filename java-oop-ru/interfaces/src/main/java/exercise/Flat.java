package exercise;

public class Flat implements Home {

  private final double area;
  private final int floor;
  private final double balconyArea;

  public Flat(double area, double balconyArea, int floor) {
    this.area = area;
    this.balconyArea = balconyArea;
    this.floor = floor;
  }

  public double getBalconyArea() {
    return balconyArea;
  }

  public double getFlatArea() {
    return area;
  }

  public int getFloor() {
    return floor;
  }

  @Override
  public String toString() {
    return "Квартира площадью " + getArea() + " метров на " + getFloor() + " этаже";
  }

  @Override
  public double getArea() {
    return getBalconyArea() + getFlatArea();
  }

  @Override
  public int compareTo(Home anotherHome) {
    if (getArea() > anotherHome.getArea()) {
      return 1;
    } else if (getArea() < anotherHome.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }

}
