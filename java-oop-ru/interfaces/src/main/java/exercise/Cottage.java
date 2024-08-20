package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;
    
    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    @Override
    public double getArea() {
    return area;
    }
    @Override
    public double getFloorCount() {
        return floorCount;
    }
    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }
    @Override
    public int compareTo(Home another1) {
        double thisGetArea = this.getArea();
        double anotherGetArea = another1.getArea();
        if (thisGetArea > anotherGetArea) {
            return 1;
        } else if (thisGetArea < anotherGetArea) {
            return -1;
        } else {
            return  0;
        }
}
// END
