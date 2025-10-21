import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat test = new CodingBat();

    @org.junit.Test
    public void sleepIn() {
        assertTrue(test.sleepIn(true, true));
        assertFalse(test.sleepIn(true, false));
        assertTrue(test.sleepIn(false, true));
    }

    @org.junit.Test
    public void nearHundred() {
        assertTrue(test.nearHundred(101));
        assertFalse(test.nearHundred(25));
        assertTrue(test.nearHundred(209));
    }

    @org.junit.Test
    public void countEvens() {
        int[] n = {2,2,2,2,2,6};
        int[] m = {1,3,5,7};
        int[] o = {2,2,2,11,567};
        assertEquals(6, test.countEvens(n));
        assertEquals(0, test.countEvens(m));
        assertEquals(3, test.countEvens(o));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Nikodem!", test.helloName("Nikodem"));
        assertEquals("Hello Wojtek!", test.helloName("Wojtek"));
        assertNotEquals("Hello Michal!", test.helloName("Michala"));
    }
}