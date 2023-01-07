package week07.exercise1_4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center      = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.x -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ",radius=" + this.radius;
    }
}
