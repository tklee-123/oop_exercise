package week13.iterator.ex1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana")
                .add("Orange")
                .add("Coconut");

        Iterator it = productCatalog.getIterator();
        while (it.hasNext()) {
            String product = (String) it.next();
            System.out.println(product);
        }
    }
}
