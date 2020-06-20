public class Segment {
    private Point start, end;
    public  Segment(){
        this.start = new Point();
        this.end = new Point();
    }
    public  Segment(Point p1, Point p2){
        this.start = p1;
        this.end = p2;
    }
    public  Segment(Point p2){
        this.start = new Point();
        this.end = p2;
    }
    public double length() {
        return Point.distance(this.start, this.end);
    }
    public static boolean equal (Segment first, Segment second){
        return (first.length()==second.length() ? true : false);
    }

}
