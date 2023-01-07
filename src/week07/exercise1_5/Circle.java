package week07.exercise1_5;

public class Circle implements GeometricObject{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + this.radius + "]";
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * 2;
    }
}
