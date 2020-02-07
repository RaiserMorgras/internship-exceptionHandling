package exceptionHandlingTest;

public class PowerCalculator {

    public static long myPow(int n, int p) throws ArithmeticException {
        if (n < 0 || p < 0) {
            throw new ArithmeticException("n or p should not be negative");
        }
        if (n == 0 && p == 0) {
            throw new ArithmeticException("n and p should not be zero at the same time");
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
}
