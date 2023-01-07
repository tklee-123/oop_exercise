package week06.exercise2_2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:"
                + " height= " + cylinder1.getHeight()
                + " base area= " + cylinder1.getArea()
                + " volume= " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " height= " + cylinder2.getHeight()
                + " base area= " + cylinder2.getArea()
                + " volume= " + cylinder2.getVolume());
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " height= " + cylinder3.getHeight()
                + " base area= " + cylinder3.getArea()
                + " volume= " + cylinder3.getVolume());
    }
}
