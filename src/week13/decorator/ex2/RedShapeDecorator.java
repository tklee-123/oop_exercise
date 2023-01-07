package week13.decorator.ex2;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
        shape.draw();
    }

    private void setRedBorder() {
        System.out.print("Red ");
    }

}
