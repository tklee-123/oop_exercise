package week05.exercise2_10;

public class MyRectangle {
    private double width = 1;
    private double height = 1;

    public MyRectangle () {

    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area = width * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}
