package exceptionHandlingTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCase1() {
        int n = 3;
        int p = 5;
        long expected = 243;
        long actual = PowerCalculator.myPow(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int n = 2;
        int p = 4;
        long expected = 16;
        long actual = PowerCalculator.myPow(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        thrown.expect(java.lang.ArithmeticException.class);
        thrown.expectMessage("n and p should not be zero at the same time");

        int n = 0;
        int p = 0;

        PowerCalculator.myPow(n, p);
    }

    @Test
    public void testCase4() {
        thrown.expect(java.lang.ArithmeticException.class);
        thrown.expectMessage("n or p should not be negative");

        int n = -1;
        int p = -2;

        PowerCalculator.myPow(n, p);
    }

    @Test
    public void testCase5() {
        thrown.expect(java.lang.ArithmeticException.class);
        thrown.expectMessage("n or p should not be negative");

        int n = -1;
        int p = 3;

        PowerCalculator.myPow(n, p);
    }
}
