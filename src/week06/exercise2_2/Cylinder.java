package week06.exercise2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return base.getArea() * 2 + 2 * Math.PI * base.getRadius() * height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
