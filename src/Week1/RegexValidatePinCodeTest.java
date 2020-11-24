package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegexValidatePinCodeTest {
    @Test
    public void validPins() {
        assertEquals(true, RegexValidatePinCode.validatePin("1234"));
        assertEquals(true, RegexValidatePinCode.validatePin("0000"));
        assertEquals(true, RegexValidatePinCode.validatePin("1111"));
        assertEquals(true, RegexValidatePinCode.validatePin("123456"));
        assertEquals(true, RegexValidatePinCode.validatePin("098765"));
        assertEquals(true, RegexValidatePinCode.validatePin("000000"));
        assertEquals(true, RegexValidatePinCode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, RegexValidatePinCode.validatePin("a234"));
        assertEquals(false, RegexValidatePinCode.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, RegexValidatePinCode.validatePin("123/"));
        assertEquals(false, RegexValidatePinCode.validatePin("1\n"));
        assertEquals(false, RegexValidatePinCode.validatePin("12"));
        assertEquals(false, RegexValidatePinCode.validatePin("9¾9¾"));
        assertEquals(false, RegexValidatePinCode.validatePin("1234\n"));
        assertEquals(false, RegexValidatePinCode.validatePin("1234567"));
        assertEquals(false, RegexValidatePinCode.validatePin("-1234"));
        assertEquals(false, RegexValidatePinCode.validatePin("1.234"));
        assertEquals(false, RegexValidatePinCode.validatePin("00000000"));
    }

}