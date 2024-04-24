import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LineTest {

    private Point point1;
    private Point point2;
    private Line line;

    @BeforeEach
    void setup() {
        point1 = new Point(2.0, 3.0);
        point2 = new Point(4.0, 5.0);
        line = new Line(point1, point2);
    }

    @Test
    void testMove() {
        line.move(1.0, -2.0);
        assertEquals(3.0, line.getStart().getX(), 0.001);
        assertEquals(1.0, line.getStart().getY(), 0.001);
        assertEquals(5.0, line.getEnd().getX(), 0.001);
        assertEquals(3.0, line.getEnd().getY(), 0.001);
    }

    @Test
    void testFlip() {
        line.flip();
        assertEquals(-2.0, line.getStart().getX(), 0.001);
        assertEquals(-3.0, line.getStart().getY(), 0.001);
        assertEquals(-4.0, line.getEnd().getX(), 0.001);
        assertEquals(-5.0, line.getEnd().getY(), 0.001);
    }

    @Test
    void testEquals() {
        Point point3 = new Point(2.0, 3.0);
        Point point4 = new Point(4.0, 5.0);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(point1, point4);

        assertTrue(line.equals(line2));
    }

    @Test
    void testToString() {
        assertEquals("(2.0, 3.0) -> (4.0, 5.0)", line.toString());
    }
}

