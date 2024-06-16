package exercise;

public class Cottage extends Flat implements Home {

  private static final int balconyArea = 0;
  private final double area;
  private final int floor;

  public Cottage(double area, int floor) {
    super(area, floor, balconyArea);
    this.area = area;
    this.floor = floor;
  }

  public double getCottageArea() {
    return area;
  }

  public int getFloorCount() {
    return floor;
  }

  @Override
  public String toString() {
    return getFloorCount() + " этажный коттедж площадью " + getCottageArea() + " метров";
  }

  @Override
  public double getArea() {
    return getCottageArea();
  }

}

