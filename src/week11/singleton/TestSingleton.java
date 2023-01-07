package week11.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Database db1 = Database.getInstance(); // create new instance
        System.out.println(db1);

        Database db2 = Database.getInstance(); // return created instance
        System.out.println(db2);
    }
}
