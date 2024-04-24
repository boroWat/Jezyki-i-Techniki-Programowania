import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorial() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void testFactorial1() throws MyException {
        assertEquals(1, Factorial.factorial1(0));
        assertEquals(1, Factorial.factorial1(1));
        assertEquals(2, Factorial.factorial1(2));
        assertEquals(24, Factorial.factorial1(4));
        assertEquals(120, Factorial.factorial1(5));
    }
}