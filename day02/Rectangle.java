public class Rectangle {
    double width,height;

    public Rectangle(double w, double h){
    width = w;
    height = h;
    }
    public double getArea() {
        return width * height;
    }
    public void display() {
        System.out.println("Area: " + getArea());
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0, 3.0);
        r.display();
    }
}
