package exceptionHandlingTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void testCase1() {
        int n = 3;
        int p = 5;
        String expected = "243";
        String actual = PowerCalculator.getMessageOnPower(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int n = 2;
        int p = 4;
        String expected = "16";
        String actual = PowerCalculator.getMessageOnPower(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int n = 0;
        int p = 0;
        String expected = "java.lang.Exception: n and p should not be zero at the same time";
        String actual = PowerCalculator.getMessageOnPower(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        int n = -1;
        int p = -2;
        String expected = "java.lang.Exception: n and p should not be negative";
        String actual = PowerCalculator.getMessageOnPower(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase5() {
        int n = -1;
        int p = 3;
        String expected = "java.lang.Exception: n and p should not be negative";
        String actual = PowerCalculator.getMessageOnPower(n, p);

        assertEquals(expected, actual);
    }
}
