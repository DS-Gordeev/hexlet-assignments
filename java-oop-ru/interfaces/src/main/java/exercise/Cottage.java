package exercise;

public class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return Math.round((area) * 10) / 10.0;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }

    @Override
    public int compareTo(Home otherCottage) {
        return Double.compare(getArea(), otherCottage.getArea());
    }
}