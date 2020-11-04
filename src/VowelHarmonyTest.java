import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelHarmonyTest {
    @Test
    public void exampleTests() {
        assertEquals("ablaknak", VowelHarmony.dative("ablak"));
        assertEquals("tükörnek", VowelHarmony.dative("tükör"));
        assertEquals("keretnek", VowelHarmony.dative("keret"));
        assertEquals("otthonnak", VowelHarmony.dative("otthon"));
        assertEquals("virágnak", VowelHarmony.dative("virág"));
        assertEquals("tettnek", VowelHarmony.dative("tett"));
        assertEquals("rokkantnak", VowelHarmony.dative("rokkant"));
        assertEquals("rossznak", VowelHarmony.dative("rossz"));
        assertEquals("gonosznak", VowelHarmony.dative("gonosz"));
    }
}
