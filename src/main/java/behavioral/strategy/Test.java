package behavioral.strategy;

public class Test {

    public static void main(String[] args) {
        Point point = new Point(10, 20);
        point.setEq(Point.ORIGIN);
        System.out.println(point.equals(new Point(20, 10)));
        point.setEq(Point.SQUARE);
        System.out.println(point.equals(new Point(20, 10)));
    }
}
