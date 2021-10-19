package task1;

import java.util.ArrayList;

public class LineConcatenator {

    public String concatLines(ArrayList<StringBuilder> listOfString) {
        StringBuilder alignedText = new StringBuilder();
        for (StringBuilder line:
                listOfString) {
            alignedText.append(line).append('\n');
        }
        return alignedText.toString();
    }
}
