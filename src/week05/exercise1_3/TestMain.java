package week05.exercise1_3;

public class TestMain {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        // Test getters and setters
        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1);
        System.out.println("length is: " + rectangle1.getLength());
        System.out.println("width is: " + rectangle1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", rectangle1.getArea());
        System.out.printf("perimeter is: %.2f%n", rectangle1.getPerimeter());
    }
}
