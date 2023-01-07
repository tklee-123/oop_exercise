package week07.exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5.0);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        ResizableCircle circle2 = new ResizableCircle(2.0);
        circle2.resize(10);
        System.out.println(circle2);
    }
}
