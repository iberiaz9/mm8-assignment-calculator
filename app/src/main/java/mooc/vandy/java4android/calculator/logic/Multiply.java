package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public final class Multiply implements Operation {
    // TODO -- start your code here

    public int [] operate(int num1, int num2) throws ArithmeticException {
        int[] ans = {Math.multiplyExact(num1, num2)};
        return ans;
    }
}
