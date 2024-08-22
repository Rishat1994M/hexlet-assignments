package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;
    
    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    
    public double getTotalArea() {
        return this.area + balconyArea;
    } 
    
    public String toString() {
         return String.format("Квартира площадью %s метров на %d этаже", getArea(), floor);
    } 

    public int compareTo(Home another) {
        if(another.getTotalArea() == this.getTotalArea()) {
            return 0;
        } else if(another.getTotalArea() > this.getTotalArea()) {
            return -1;
        } else {
            return  1;
        }
}
// END
