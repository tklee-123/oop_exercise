package week13.decorator.ex1;

public abstract class ToppingDecorator {
    protected IceCream iceCream;

    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
