public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getP1x() {
        return p1.getX();
    }
    public double getP1y() {
        return p1.getY();
    }
    public double getP2x() {
        return p2.getX();
    }
    public double getP2y() {
        return p2.getY();
    }

    public void move(double dx, double dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
    }

    public void flip() {
        p1.flip();
        p2.flip();
    }

    @Override
    public String toString() {
        return  p1.toString() + "; " + p2.toString();
    }
}