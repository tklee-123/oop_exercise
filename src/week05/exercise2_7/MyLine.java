package week05.exercise2_7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin.x = x1;
        this.begin.y = x2;
        this.end.x = y1;
        this.end.y = y2;
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.x = x;
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.y = y;
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.x = x;
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.y = y;
    }

    public int[] getBeginXY() {
        int[] array = {begin.x, begin.y};
        return array;
    }

    public void setBeginXY(int x, int y) {
        this.begin.x = x;
        this.begin.y = y;
    }

    public int[] getEndXY() {
        int[] array = {end.x, end.y};
        return array;
    }

    public void setEndXY(int x, int y) {
        this.end.x = x;
        this.end.y = y;
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "MyLine[begin=(" + begin.x + "," + begin.y + ",end=(" + end.x + "," + end.y + ")]";
    }

}
