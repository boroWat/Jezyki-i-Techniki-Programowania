import java.util.List;
class Line implements Figure {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void move(double dx, double dy) {
        if (start != null && end != null) {
            start.move(dx, dy);
            end.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        if (start != null && end != null) {
            start.flip();
            end.flip();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public String toString() {
        return start.toString() + " -> " + end.toString();
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}