package Week1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexValidation {
    public static void main(String[] args) {

    }

    public static Boolean validateTime(String time) {
        if (time.matches(("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$"))) {
            return true;

        }

        return false;
    }

    @Test
    public void test1() {
        assertTrue(RegexValidation.validateTime("01:00"));
    }

    @Test
    public void test2() {
        assertTrue(RegexValidation.validateTime("1:00"));
    }

    @Test
    public void test3() {
        assertTrue(RegexValidation.validateTime("00:00"));
    }

    @Test
    public void test4() {
        assertFalse(RegexValidation.validateTime("13:1"));
    }

    @Test
    public void test5() {
        assertFalse(RegexValidation.validateTime("12:60"));
    }
}
