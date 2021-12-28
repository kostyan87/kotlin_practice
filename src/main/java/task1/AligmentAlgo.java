package task1;

import task2.IncorrectExpressionException;

import java.util.ArrayList;

public abstract class AligmentAlgo {

    public final String alignText(String text, int width) {
        if (width < 0) throw new IncorrectWidthException("Incorrect width");
        ArrayList<StringBuilder> listOfString =
                new ToArrayOfStringConverter().convertToArrayOfString(text, width);
        align(listOfString, width);
        return new LineConcatenator().concatLines(listOfString);
    }

    protected abstract void align(ArrayList<StringBuilder> listOfString, int width);
}
