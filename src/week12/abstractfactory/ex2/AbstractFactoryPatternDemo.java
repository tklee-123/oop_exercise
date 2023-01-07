package week12.abstractfactory.ex2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory roundedShapeFactory = producer.getFactory("Rounded");
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        roundedRectangle.draw();

        AbstractFactory shapeFactory = producer.getFactory("NotRounded");
        Shape notRoundedSquare = shapeFactory.getShape("Square");
        notRoundedSquare.draw();
    }
}
