import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestvowelchainTest {

    @Test
    public void test(){
        assertEquals(0,Longestvowelchain.longvowel(" "));
    }
    @Test
    public void basicTests(){
        assertEquals(3,Longestvowelchain.longvowel("ultrarevolutionariees"));
        assertEquals(2,Longestvowelchain.longvowel("codewarriors"));
        assertEquals(3,Longestvowelchain.longvowel("suoidea"));
        assertEquals(1,Longestvowelchain.longvowel("strengthlessnesses"));
        assertEquals(11,Longestvowelchain.longvowel("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
    }

}