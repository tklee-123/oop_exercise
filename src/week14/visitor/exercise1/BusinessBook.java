package week14.visitor.exercise1;

public class BusinessBook extends Book {
    private String publisher;

    public BusinessBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return publisher;
    }
}
