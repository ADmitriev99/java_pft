public class Task2_1 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(-3, 0);
        Segment one = new Segment(p1, p2);
        Segment two = new Segment(p3, p2);
        if (Segment.equal (one, two)) {
            System.out.println("Длины отрезков равны");
        }
        else {
            System.out.println("Длины отрезков не равны");
        }
    }
}
