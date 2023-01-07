package week14.visitor.exercise3;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor v);
}



