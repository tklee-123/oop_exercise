package week06.exercise2_1;

public class TestLineSub {
    public static void main(String[] args) {
        Point begin = new Point(3, 4);
        Point end = new Point(5, 6);
        System.out.println(begin);
        System.out.println(end);
        Line line1 = new Line(begin, end);
        System.out.println(line1);
        System.out.println("Length of this line is : " + line1.getLength());
        LineSub line2 = new LineSub(begin, end);
        System.out.println(line2);
        System.out.println("Gradient of this line is : " + line2.getGradient());
    }
}
