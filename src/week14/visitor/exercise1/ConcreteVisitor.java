package week14.visitor.exercise1;

public class ConcreteVisitor implements Visitor {
    private double totalPrice;

    public ConcreteVisitor() {
        this.totalPrice = 0.0;
    }

    @Override
    public void visit(BusinessBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getFavouriteBook());
    }

    @Override
    public void visit(DesignPatternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
