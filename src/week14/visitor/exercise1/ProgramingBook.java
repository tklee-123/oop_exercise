package week14.visitor.exercise1;

public abstract class ProgramingBook extends Book {
    public ProgramingBook(double price) {
        super(price);
    }

    public abstract String getResource();
}
