package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public final class Subtract implements Operation {
    // TODO -- start your code here

    public int [] operate(int num1, int num2) throws ArithmeticException {
        int[] ans = {Math.subtractExact(num1, num2)};
        return ans;
    }
}
