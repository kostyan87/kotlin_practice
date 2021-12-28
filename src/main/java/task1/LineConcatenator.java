package task1;

import java.util.ArrayList;

public class LineConcatenator {

    public String concatLines(ArrayList<StringBuilder> listOfString) {
        StringBuilder alignedText = new StringBuilder();
        for (int i = 0; i < listOfString.size(); i++) {
            StringBuilder str = listOfString.get(i);
            if (i == listOfString.size() - 1)
                alignedText.append(str);
            else
                alignedText.append(str).append('\n');
        }
        return alignedText.toString();
    }
}
