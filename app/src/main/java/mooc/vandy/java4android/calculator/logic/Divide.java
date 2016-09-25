package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public final class Divide implements Operation {
    // TODO -- start your code here

    public int [] operate(int num1, int num2) throws ArithmeticException{
        int [] res = {num1 / num2, num1 % num2};
        return res;
    }
}
