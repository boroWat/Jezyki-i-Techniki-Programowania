import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LineTest {

    @Test
    public void testMove(){
        Point p1 = new Point(1,2);
        Point p2 = new Point(3, 2);
        Line L = new Line(p1, p2);
        L.move(1,1);

        assertEquals(Double.valueOf(2.0), L.getP1x(), 0.0);
        assertEquals(Double.valueOf(3.0), L.getP1y(), 0.0);
        assertEquals(Double.valueOf(4.0), L.getP2x(), 0.0);
        assertEquals(Double.valueOf(3.0), L.getP2y(), 0.0);
    }

    @Test
    public void testFlip(){
        Point p1 = new Point(1,2);
        Point p2 = new Point(3, 2);
        Line L = new Line(p1, p2);
        L.flip();

        assertEquals(Double.valueOf(-1.0), L.getP1x(), 0.0);
        assertEquals(Double.valueOf(-2.0), L.getP1y(), 0.0);
        assertEquals(Double.valueOf(-3.0), L.getP2x(), 0.0);
        assertEquals(Double.valueOf(-2.0), L.getP2y(), 0.0);
    }

}