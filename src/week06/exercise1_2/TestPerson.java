package week06.exercise1_2;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("Huyen", "Ha Noi", "KHDL", 2021, 1000.0);
        System.out.println(student);

        Staff staff = new Staff("Quynh", "Ha Noi", "Khoa hoc tu nhien", 1000.0);
        System.out.println(staff);
    }
}
