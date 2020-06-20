public class Point {
    private double x = 0, y = 0;
    public  Point(){
        this.x=0;
        this.y=0;
    }
    public  Point (double x, double y){
        this.x=x;
        this.y=y;
    }
    public static double distance(Point p1, Point p2)
    {
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }
}
