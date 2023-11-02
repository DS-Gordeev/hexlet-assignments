package exercise;

public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }


    @Override
    public double getArea() {
        return Math.round((area + balconyArea) * 10) / 10.0;
    }


    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }

    @Override
    public int compareTo(Home otherFlat) {
        return Double.compare(getArea(), otherFlat.getArea());
    }
}
