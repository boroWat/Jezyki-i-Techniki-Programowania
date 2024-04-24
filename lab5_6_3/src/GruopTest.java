import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class GroupTest {

    private Polygon polygon1;
    private Polygon polygon2;
    private Group group;

    @BeforeEach
    void setup() {
        List<Point> points1 = Arrays.asList(new Point(2.0, 3.0), new Point(4.0, 5.0), new Point(6.0, 7.0));
        List<Point> points2 = Arrays.asList(new Point(1.0, 1.0), new Point(3.0, 3.0), new Point(5.0, 5.0));

        polygon1 = new Polygon(points1);
        polygon2 = new Polygon(points2);
        List<Polygon> polygons = Arrays.asList(polygon1, polygon2);
        group = new Group(polygons);
    }

    @Test
    void testMove() {
        group.move(1.0, -2.0);

        List<Point> points1 = polygon1.getListaP();
        assertEquals(3.0, points1.get(0).getX(), 0.001);
        assertEquals(1.0, points1.get(0).getY(), 0.001);
        assertEquals(5.0, points1.get(1).getX(), 0.001);
        assertEquals(3.0, points1.get(1).getY(), 0.001);
        assertEquals(7.0, points1.get(2).getX(), 0.001);
        assertEquals(5.0, points1.get(2).getY(), 0.001);

        List<Point> points2 = polygon2.getListaP();
        assertEquals(2.0, points2.get(0).getX(), 0.001);
        assertEquals(-1.0, points2.get(0).getY(), 0.001);
        assertEquals(4.0, points2.get(1).getX(), 0.001);
        assertEquals(1.0, points2.get(1).getY(), 0.001);
        assertEquals(6.0, points2.get(2).getX(), 0.001);
        assertEquals(3.0, points2.get(2).getY(), 0.001);
    }

    @Test
    void testFlip() {
        group.flip();

        List<Point> points1 = polygon1.getListaP();
        assertEquals(-2.0, points1.get(0).getX(), 0.001);
        assertEquals(-3.0, points1.get(0).getY(), 0.001);
        assertEquals(-4.0, points1.get(1).getX(), 0.001);
        assertEquals(-5.0, points1.get(1).getY(), 0.001);
        assertEquals(-6.0, points1.get(2).getX(), 0.001);
        assertEquals(-7.0, points1.get(2).getY(), 0.001);

        List<Point> points2 = polygon2.getListaP();
        assertEquals(-1.0, points2.get(0).getX(), 0.001);
        assertEquals(-1.0, points2.get(0).getY(), 0.001);
        assertEquals(-3.0, points2.get(1).getX(), 0.001);
        assertEquals(-3.0, points2.get(1).getY(), 0.001);
        assertEquals(-5.0, points2.get(2).getX(), 0.001);
        assertEquals(-5.0, points2.get(2).getY(), 0.001);
    }

    @Test
    void testEquals() {
        List<Point> points1 = Arrays.asList(new Point(2.0, 3.0), new Point(4.0, 5.0), new Point(6.0, 7.0));
        List<Point> points2 = Arrays.asList(new Point(1.0, 1.0), new Point(3.0, 3.0), new Point(5.0, 5.0));
        Polygon polygon3 = new Polygon(points1);
        Polygon polygon4 = new Polygon(points2);
        List<Polygon> polygons2 = Arrays.asList(polygon3, polygon4);
        Group group2 = new Group(polygons2);

        assertTrue(group.equals(group2));
    }

    @Test
    void testToString() {
        String expected = "Wielokat 1\n" +
                "(2.0, 3.0)\n" +
                "(4.0, 5.0)\n" +
                "(6.0, 7.0)\n" +
                "\n" +
                "Wielokat 2\n" +
                "(1.0, 1.0)\n" +
                "(3.0, 3.0)\n" +
                "(5.0, 5.0)\n" +
                "\n";
        assertEquals(expected, group.toString());
    }
}
