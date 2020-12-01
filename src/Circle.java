public class Circle implements GeometricObject{
    protected double radius;

    public Circle() {
        radius=1.0d;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getArea() {
        return Math.PI*(radius*radius);
    }
}
