package behavioral.strategy;

interface Equals {
    public boolean eq(Point p1, Point p2);
}

public class Point {

    private int x;
    private int y;
    private Equals equals;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Equals getEq() {
        return equals;
    }

    public void setEq(Equals eq) {
        this.equals = eq;
    }

    public static final Equals ORIGIN = new Equals() {

        @Override
        public boolean eq(Point p1, Point p2) {
            return p1.x == p2.x && p1.y == p2.y;
        }
    };

    public static final Equals SQUARE = new Equals() {

        @Override
        public boolean eq(Point p1, Point p2) {
            return p1.x * p1.y == p2.x * p2.y;
        }
    };

    @Override
    public boolean equals(Object o) {
        return equals.eq(this, (Point) o);
    }
}
