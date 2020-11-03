import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersInStringTest {
    @Test
    public void basicTests(){
        assertEquals(9,NumbersInString.solveNumbers("2ti9iei7qhr5"));
        assertEquals(695,NumbersInString.solveNumbers("gh12cdy695m1"));
        assertEquals(85,NumbersInString.solveNumbers("lu1j8qbbb85"));
        assertEquals(185,NumbersInString.solveNumbers("185lu1j8qbbb85"));
    }

}