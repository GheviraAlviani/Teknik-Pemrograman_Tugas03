public class Circle {

    private double radius;
    private String color;

    //Constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    //Constructor (radius)
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    //Constructor (radius and color)
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    //Getter for radius
    public double getRadius() {
        return radius;
    }
    //Getter for color
    public String getColor() {
        return color;
    }
    //Setter for color
    public void setColor(String c) {
        color = c;
    }
    //Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
