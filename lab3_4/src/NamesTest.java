import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NamesTest {
    private Names names;

    @Before
    public void setUp() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("Dave");
        nameList.add("Eve");
        names = new Names(nameList);
    }

    @Test
    public void testChoose() {
        ArrayList<String> chosenNames = new ArrayList<>();

        // Wybieramy imiona z listy
        for (int i = 0; i < 5; i++) {
            String name = names.choose();
            assertNotNull(name);
            chosenNames.add(name);
        }

        // Sprawdzamy, czy wybrane imiona są różne od siebie
        assertNotEquals(chosenNames.get(0), chosenNames.get(1));
        assertNotEquals(chosenNames.get(0), chosenNames.get(2));
        assertNotEquals(chosenNames.get(0), chosenNames.get(3));
        assertNotEquals(chosenNames.get(0), chosenNames.get(4));
        assertNotEquals(chosenNames.get(1), chosenNames.get(2));
        assertNotEquals(chosenNames.get(1), chosenNames.get(3));
        assertNotEquals(chosenNames.get(1), chosenNames.get(4));
        assertNotEquals(chosenNames.get(2), chosenNames.get(3));
        assertNotEquals(chosenNames.get(2), chosenNames.get(4));
        assertNotEquals(chosenNames.get(3), chosenNames.get(4));

        // Sprawdzamy, czy lista imion została usunięta
        assertEquals(0, names.getNames().size());
        assertNull(names.choose());
    }

    @Test
    public void testChooseWithEmptyList() {
        names.getNames().clear();
        assertNull(names.choose());
    }
}
