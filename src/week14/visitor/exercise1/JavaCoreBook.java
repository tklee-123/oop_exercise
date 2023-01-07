package week14.visitor.exercise1;

public class JavaCoreBook extends ProgramingBook {
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(double price, String resource, String favouriteBook) {
        super(price);
        this.resource = resource;
        this.favouriteBook = favouriteBook;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }
}
