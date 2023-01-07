package week14.visitor.exercise1;

public abstract class Book {
    protected double price;

    public Book(double price) {
        this.price = price;
    }

    public abstract void accept(Visitor v);

    public double getPrice() {
        return price;
    }
}
