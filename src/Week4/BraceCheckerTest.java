package Week4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BraceCheckerTest {
    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }
}