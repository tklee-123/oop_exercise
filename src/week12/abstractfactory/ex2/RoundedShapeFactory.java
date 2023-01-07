package week12.abstractfactory.ex2;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new RoundedRectangle();
        } else if (type.equals("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
