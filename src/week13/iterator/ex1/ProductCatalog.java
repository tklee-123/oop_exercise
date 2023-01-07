package week13.iterator.ex1;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;
    private final int SIZE = 100;
    private int length;

    public ProductCatalog() {
        productCatalog = new String[this.SIZE];
        this.length = -1;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this.productCatalog, this.length);
    }

    public ProductCatalog add(String product) {
        if (length >= this.productCatalog.length - 1) {
            return this;
        }
        this.productCatalog[this.length + 1] = product;
        this.length++;
        return this;
    }
}
