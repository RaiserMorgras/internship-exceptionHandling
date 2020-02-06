package exceptionHandlingTest;

public class PowerCalculator {

    private static long myPow(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should not be negative");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero at the same time");
        }
        if (n == 0) {
            return 0;
        }
        if (p == 0) {
            return 1;
        }
        long result = 1;

        while (p > 0) {
            if ((p % 2) == 0) {
                p /= 2;
                n *= n;
            }
            else {
                p -= 1;
                result *= n;
            }
        }
        return result;
    }
    public static String getMessageOnPower(int n, int p) {
        try {
            long result = myPow(n, p);
            return Long.toString(result);
        }
        catch (Exception e) {
            return e.toString();
        }
    }
}
