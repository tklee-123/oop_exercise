package week12.factorymethod.ex2;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        } else if (type.equals("Banana")) {
            return new Banana();
        } else {
            return new Orange();
        }
    }
}
