package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {

    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        int ans = 0;
        switch (operation) {
            case ADD:
                try {
                    ans = new Add().operate(argumentOne, argumentTwo)[0];
                }
                catch (ArithmeticException e)
                {
                    mOut.print(e.getMessage());
                    return;
                }
                break;

            case SUBTRACT:
                try {
                    ans = new Subtract().operate(argumentOne, argumentTwo)[0];
                }
                catch (ArithmeticException e)
                {
                    mOut.print(e.getMessage());
                    return;
                }
                break;

            case MULTIPLY:
                try {
                    ans = new Multiply().operate(argumentOne, argumentTwo)[0];
                }
                catch (ArithmeticException e)
                {
                    mOut.print(e.getMessage());
                    return;
                }
                break;

            case DIVIDE:
                try {
                    int[] divRem = new Divide().operate(argumentOne, argumentTwo);
                    mOut.print("" + divRem[0] + " R: " + divRem[1]);
                    return;
                }
                catch (ArithmeticException e)
                {
                    mOut.print(e.getMessage());
                    return;
                }

            default:
                mOut.print("Internal error: unknown op");
                return;
        }

        if (operation != DIVIDE) mOut.print("" + ans);
    }
}
