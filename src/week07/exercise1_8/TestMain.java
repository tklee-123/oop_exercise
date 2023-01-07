package week07.exercise1_8;

import week07.exercise1_4.Movable;
import week07.exercise1_4.MovableCircle;
import week07.exercise1_4.MovablePoint;

public class TestMain {
    public static void main(String[] args) {
        Movable center = new MovablePoint(2, 3, 4, 5);
        System.out.println(center);
        center.moveLeft();
        System.out.println(center);
        center.moveRight();
        System.out.println(center);
        center.moveDown();
        System.out.println(center);
        week07.exercise1_4.MovableCircle circle = new MovableCircle(2, 3, 4, 5, 2);
        circle.moveUp();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
    }
}
