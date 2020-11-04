import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplePigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
        assertEquals("Oay emporatay oay oresmay !", SimplePigLatin.pigIt("O tempora o mores !"));
    }

    @Test
    public void nultest() {
        assertEquals(null, SimplePigLatin.pigIt(""));

    }

    @Test
    public void oneWord() {
        assertEquals("igPay atinlay", SimplePigLatin.pigIt("Pig latin"));

    }

}