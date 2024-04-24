import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class PolygonTest {

    private Point point1;
    private Point point2;
    private Point point3;
    private Polygon polygon;

    @BeforeEach
    void setup() {
        point1 = new Point(2.0, 3.0);
        point2 = new Point(4.0, 5.0);
        point3 = new Point(6.0, 7.0);
        List<Point> points = Arrays.asList(point1, point2, point3);
        polygon = new Polygon(points);
    }

    @Test
    void testMove() {
        polygon.move(1.0, -2.0);
        assertEquals(3.0, polygon.getListaP().get(0).getX(), 0.001);
        assertEquals(1.0, polygon.getListaP().get(0).getY(), 0.001);
        assertEquals(5.0, polygon.getListaP().get(1).getX(), 0.001);
        assertEquals(3.0, polygon.getListaP().get(1).getY(), 0.001);
        assertEquals(7.0, polygon.getListaP().get(2).getX(), 0.001);
        assertEquals(5.0, polygon.getListaP().get(2).getY(), 0.001);
    }

    @Test
    void testFlip() {
        polygon.flip();
        assertEquals(-2.0, polygon.getListaP().get(0).getX(), 0.001);
        assertEquals(-3.0, polygon.getListaP().get(0).getY(), 0.001);
        assertEquals(-4.0, polygon.getListaP().get(1).getX(), 0.001);
        assertEquals(-5.0, polygon.getListaP().get(1).getY(), 0.001);
        assertEquals(-6.0, polygon.getListaP().get(2).getX(), 0.001);
        assertEquals(-7.0, polygon.getListaP().get(2).getY(), 0.001);
    }

    @Test
    void testEquals() {
        List<Point> points1 = Arrays.asList(new Point(2.0, 3.0), new Point(4.0, 5.0), new Point(6.0, 7.0));
        List<Point> points2 = Arrays.asList(new Point(2.0, 3.0), new Point(4.0, 5.0), new Point(6.0, 7.0));
        List<Point> points3 = Arrays.asList(new Point(2.0, 3.0), new Point(4.0, 5.0));

        Polygon polygon2 = new Polygon(points1);
        Polygon polygon3 = new Polygon(points2);
        Polygon polygon4 = new Polygon(points3);

        assertTrue(polygon.equals(polygon2));
        assertTrue(polygon.equals(polygon3));
        assertFalse(polygon.equals(polygon4));
    }

    @Test
    void testToString() {
        String expectedString = "Punkt1 (2.0, 3.0)\n" +
                "Punkt2 (4.0, 5.0)\n" +
                "Punkt3 (6.0, 7.0)\n";
        assertEquals(expectedString, polygon.toString());
    }
}

