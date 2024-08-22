package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    Cottage(double area, int floorCount) {
    this.area = area;
    this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public String toString() {
        return String.format("%s этажный коттедж площадью %d метров", floorCount, getArea());
    }
    public int compareTo(Home another) {
        if(area == another.getArea()) {
            return 0;
        } else if(another.getArea() > area)  {
            return -1;
        } else {
            return  1;
        }
    }
}
// END
