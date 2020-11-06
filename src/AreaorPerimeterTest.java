import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaorPerimeterTest {
    @Test
    public void testSomething() {
        assertEquals(16, AreaorPerimeter.areaOrPerimeter(4 , 4));
        assertEquals(32, AreaorPerimeter.areaOrPerimeter(6 , 10));
    }

}