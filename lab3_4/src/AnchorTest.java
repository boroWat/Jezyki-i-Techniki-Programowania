import org.junit.Assert;
import org.junit.Test;

public class AnchorTest {


    @Test
    public void testInsertAtTheFront() {
        Anchor lista = new Anchor();
        lista.insertAtTheFront(3);
        lista.insertAtTheFront(2);
        lista.insertAtTheFront(1);
        Assert.assertEquals("1 2 3 ", lista.toString());
    }

    @Test
    public void testInsertAtTheEnd() {
        Anchor lista = new Anchor();
        lista.insertAtTheEnd(1);
        lista.insertAtTheEnd(2);
        lista.insertAtTheEnd(3);
        Assert.assertEquals("1 2 3 ", lista.toString());
    }
    @Test
    public void testRemoveFirst() {
        Anchor lista = new Anchor();
        lista.insertAtTheEnd(1);
        lista.insertAtTheEnd(2);
        lista.insertAtTheEnd(3);
        lista.removeFirst();
        Assert.assertEquals("2 3 ", lista.toString());
    }

    @Test
    public void testRemoveLast() {
        Anchor lista = new Anchor();
        lista.insertAtTheEnd(1);
        lista.insertAtTheEnd(2);
        lista.insertAtTheEnd(3);
        lista.removeLast();
        Assert.assertEquals("1 2 ", lista.toString());
    }

    @Test
    public void testToString() {
        Anchor lista = new Anchor();
        Assert.assertEquals("", lista.toString());

        lista.insertAtTheEnd(1);
        Assert.assertEquals("1 ", lista.toString());

        lista.insertAtTheEnd(2);
        lista.insertAtTheEnd(3);
        Assert.assertEquals("1 2 3 ", lista.toString());
    }

    @Test
    public void testEquals() {
        Anchor lista1 = new Anchor();
        lista1.insertAtTheEnd(1);
        lista1.insertAtTheEnd(2);
        lista1.insertAtTheEnd(3);

        Anchor lista2 = new Anchor();
        lista2.insertAtTheEnd(1);
        lista2.insertAtTheEnd(2);
        lista2.insertAtTheEnd(3);

        Assert.assertTrue(lista1.equals(lista2));

        lista2.removeLast();
        Assert.assertFalse(lista1.equals(lista2));
    }

}