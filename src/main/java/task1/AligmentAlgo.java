package task1;

import java.util.ArrayList;

public abstract class AligmentAlgo {

    public final String alignText(String text, int width) {
        ArrayList<StringBuilder> listOfString =
                new ToArrayOfStringConverter().convertToArrayOfString(text, width);
        align(listOfString, width);
        return new LineConcatenator().concatLines(listOfString);
    }

    public abstract void align(ArrayList<StringBuilder> listOfString, int width);
}
