package week06.exercise1_3;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] point = new float[2];
        point[0] = this.x;
        point[1] = this.y;
        return point;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
