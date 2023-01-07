package week12.abstractfactory.ex2;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;

    }
}
