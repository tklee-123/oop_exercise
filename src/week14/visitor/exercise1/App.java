package week14.visitor.exercise1;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessBook1 = new BusinessBook(50, "DHQG");
        businessBook1.accept(visitor);

        Book designPatternBook1 = new DesignPatternBook(70, "Store", "HeadFirst");
        designPatternBook1.accept(visitor);

        Book javaCoreBook1 = new JavaCoreBook(60, "Store", "Google");
        javaCoreBook1.accept(visitor);
        System.out.println();

        System.out.print("Price of all books: " + visitor.getTotalPrice());
    }
}
