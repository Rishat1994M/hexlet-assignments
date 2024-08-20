package exercise;

// BEGIN
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
        return  area;
    }
    @Override
    public double getBalconyArea() {
        return balconyArea;
    }
    @Override
    public int getFloor() {
        return floor;
    }
    public double getTotalArea() {
        return  area + balconyArea;
    }
    @Override
    public String toString() {
        return "Квартира площадью " + getTotalArea() + " метров на " + floor + " этаже";);
    }
    @Override
    public int compareTo(Home another) {
        double thisGetTotalArea = this.getTotalArea();
        double anotherGetTotalArea = another.getTotalArea();
        if (thisGetTotalArea > anotherGetTotalArea) {
            return 1;
        } else if (thisGetTotalArea < anotherGetTotalArea) {
            return -1;
        } else {
            return  0;
        }
}
// END
