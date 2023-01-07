package week07.exercise1_2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(2.0);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        Rectangle rectangle1 = new Rectangle(3.0, 4.0);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        GeometricObject rectangle2 = new Rectangle(3.0, 4.0);
        System.out.println(rectangle2.getArea());
    }
}
