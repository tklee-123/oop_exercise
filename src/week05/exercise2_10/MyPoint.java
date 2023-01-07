package week05.exercise2_10;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

import java.util.Arrays;

public class MyPoint {
    int x, y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] array = {x, y};
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return sqrt(pow(x - this.x, 2) + pow(y - this.y, 2));
    }

    public double distance(MyPoint another) {
        return sqrt(pow(another.getX() - x, 2) + pow(another.getY() - y, 2));
    }

    public double distance() {
        return sqrt(pow(x, 2) + pow(y, 2));
    }
}
