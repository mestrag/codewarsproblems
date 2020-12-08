package Week4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishNotationTest {

    @Test
    public void shouldWorkWithEmptyString() {
        assertEquals("Should work with empty string", 0, ReversePolishNotation.evaluate(""), 0);
    }

    @Test
    public void shouldParseNumbers() {
        assertEquals("Should parse numbers", 3, ReversePolishNotation.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloatNumbers() {
        assertEquals("Should parse float numbers", 3.5, ReversePolishNotation.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals("Should support addition", 4, ReversePolishNotation.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals("Should support multiplication", 3.5, ReversePolishNotation.evaluate("1 3.5 *"), 0);
    }

    @Test
    public void shouldSupportSubstraction() {
        assertEquals("Should support substraction", -2, ReversePolishNotation.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals("Should support division", 2, ReversePolishNotation.evaluate("4 2 /"), 0);
    }
}