package task1;

import java.util.ArrayList;

public abstract class AligmentAlgo {

    public final String alignText(String text, int width, Aligment aligment) {
        ArrayList<String> listOfString = convertToArrayOfString(text);
        align(listOfString, aligment);
        return concatLines(listOfString);
    }

    public abstract void align(ArrayList<String> listOfString, Aligment aligment);

    public ArrayList<String> convertToArrayOfString(String text) {
        // TODO: 16.10.2021
        return null;
    }

    public String concatLines(ArrayList<String> listOfString) {
        // TODO: 16.10.2021
        return null;
    }
}
