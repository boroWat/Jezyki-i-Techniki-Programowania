import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void testMove() {
        Point point = new Point(2.0, 3.0);
        point.move(1.0, -2.0);
        assertEquals(3.0, point.getX(), 0.001);
        assertEquals(1.0, point.getY(), 0.001);
    }

    @Test
    void testFlip() {
        Point point = new Point(2.0, 3.0);
        point.flip();
        assertEquals(-2.0, point.getX(), 0.001);
        assertEquals(-3.0, point.getY(), 0.001);
    }

    @Test
    void testEquals() {
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(2.0, 3.0);
        Point point3 = new Point(4.0, 5.0);

        assertTrue(point1.equals(point2));
        assertFalse(point1.equals(point3));
    }

    @Test
    void testToString() {
        Point point = new Point(2.0, 3.0);
        assertEquals("(2.0, 3.0)", point.toString());
    }
}
