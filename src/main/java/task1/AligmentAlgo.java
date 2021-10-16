package task1;

import java.util.ArrayList;

public abstract class AligmentAlgo {

    public final String alignText(StringBuilder text, int width, Aligment aligment) {
        ArrayList<StringBuilder> listOfString = convertToArrayOfString(text, width);
        align(listOfString, aligment);
        return concatLines(listOfString);
    }

    public abstract void align(ArrayList<StringBuilder> listOfString, Aligment aligment);

    public ArrayList<StringBuilder> convertToArrayOfString(StringBuilder text, int width) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        int len = text.length();
        int start = 0;
        int end = Math.min(len, width);
        while (len > 0) {
            list.add(new StringBuilder(text.substring(start, end)));
            len = len - width;
            start = end;
            end = end + width;
        }
        return list;
    }

    public String concatLines(ArrayList<StringBuilder> listOfString) {
        StringBuilder alignedText = new StringBuilder();
        for (StringBuilder line:
                listOfString) {
            alignedText.append(line);
        }
        return alignedText.toString();
    }
}
