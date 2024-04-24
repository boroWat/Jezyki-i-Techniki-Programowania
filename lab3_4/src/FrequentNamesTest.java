import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrequentNamesTest {
    private FrequentNames frequentNames;

    @Before
    public void setUp() {
        frequentNames = new FrequentNames();
    }

    @Test
    public void testChooseWithEmptyList() {
        assertNull(frequentNames.choose());
    }

    @Test
    public void testChooseWithSingleName() {
        frequentNames.insert("AA");
        assertEquals("AA", frequentNames.choose());
        assertNull(frequentNames.choose());
    }

    @Test
    public void testChooseWithMultipleNames() {
        frequentNames.insert("AA");
        frequentNames.insert("BB");
        frequentNames.insert("AA");
        frequentNames.insert("CC");
        frequentNames.insert("BB");
        frequentNames.insert("AA");

        assertEquals("AA", frequentNames.choose());
        assertEquals("BB", frequentNames.choose());
        assertEquals("AA", frequentNames.choose());
        assertEquals("CC", frequentNames.choose());
        assertEquals("BB", frequentNames.choose());
        assertEquals("AA", frequentNames.choose());
        assertNull(frequentNames.choose());
    }

    @Test
    public void testChooseWithNoFrequentNames() {
        frequentNames.insert("AA");
        frequentNames.insert("BB");
        frequentNames.insert("CC");

        assertEquals("AA", frequentNames.choose());
        assertEquals("BB", frequentNames.choose());
        assertEquals("CC", frequentNames.choose());
        assertNull(frequentNames.choose());
    }
}