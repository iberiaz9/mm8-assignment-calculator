package mooc.vandy.java4android.calculator.logic;

import java.lang.Math;

/**
 * Perform the Add operation.
 */
public final class Add implements Operation {
    // TODO -- start your code here

    public int [] operate(int num1, int num2) throws ArithmeticException {
        int[] ans = {Math.addExact(num1, num2)};
        return ans;
    }
}
