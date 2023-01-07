package week14.visitor.exercise2;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPartDisplayVisitor visitor = new ComputerPartDisplayVisitor();

        ComputerPart keyboard = new Keyboard();
        keyboard.accept(visitor);

        ComputerPart mouse = new Mouse();
        mouse.accept(visitor);

        ComputerPart monitor = new Monitor();
        monitor.accept(visitor);

        System.out.println();
        ComputerPart[] computerParts = {keyboard, mouse, monitor};
        Computer computer = new Computer(computerParts);
        computer.accept(visitor);


    }
}
