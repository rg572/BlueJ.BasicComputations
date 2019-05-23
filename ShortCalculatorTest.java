

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShortCalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShortCalculatorTest
{
    /**
     * Default constructor for test class ShortCalculatorTest
     */
    public ShortCalculatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void shortSumTest()
    {
        //short testVal1 = 1234;
        //short testVal2 = 6543;
        ShortCalculator shortCal1 = new ShortCalculator();
        assertEquals(7777, shortCal1.shortSum((short)1234, (short)6543));
    }

    @Test
    public void shortDifferenceTest()
    {
        //short testVal1 = 6547;
        //short testVal2 = 3468;
        ShortCalculator shortCal1 = new ShortCalculator();
        assertEquals(3079, shortCal1.shortDiffernce((short)6547, (short)3468));
    }

    @Test
    public void shortProductTest()
    {
        ShortCalculator shortCal1 = new ShortCalculator();
        assertEquals(7488, shortCal1.shortProduct((short)234, (short)32));
    }

    @Test
    public void shortQuotientTest()
    {
        ShortCalculator shortCal1 = new ShortCalculator();
        assertEquals(306, shortCal1.shortQuotient((short)1224, (short)4));
    }

    @Test
    public void shortRemainderTest()
    {
        ShortCalculator shortCal1 = new ShortCalculator();
        assertEquals(40, shortCal1.shortRemainder((short)12456, (short)64));
    }
}





