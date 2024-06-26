public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void flip() {
        x = -x;
        y = -y;
    }

    @Override
    public String toString() {
        return x + ", " + y;//String.format("(%f, %f)", x, y);
    }
}
