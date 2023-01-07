package week05.exercise1_2;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle")
                .append("[")
                .append("radius = ")
                .append(this.radius);
        return description.toString();
    }
}
