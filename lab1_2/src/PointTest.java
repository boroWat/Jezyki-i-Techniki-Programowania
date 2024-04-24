import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {
    @Test
    public void testMove(){

        Point P = new Point(1,2);
        P.move(1,1);
        assertEquals(Double.valueOf(2.0), P.getX(), 0.0);
        assertEquals(Double.valueOf(3.0), P.getY(), 0.0);
    }

    @Test
    public void testFlip(){
        Point P = new Point(4.0,5.0);
        P.flip();
        assertEquals(Double.valueOf(-1.0), P.getX(), 0.0);
        assertEquals(Double.valueOf(-2.0), P.getY(), 0.0);
    }
}