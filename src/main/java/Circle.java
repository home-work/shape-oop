public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "A Rectangle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }


}
