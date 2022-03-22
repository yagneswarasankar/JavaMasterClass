package chapters.chapter6.OOP1.Point;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){}

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

    public double distance(){
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance(int x,int y){
        return Math.sqrt((this.x -x)*(this.x -x) + (this.y-y)*(this.y-y));
    }
    public double distance(Point a){
        return distance(a.x,a.y);

    }


}
