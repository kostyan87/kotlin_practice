package task1;

import java.util.ArrayList;

public class LeftAlign extends AligmentAlgo {
    @Override
    public void align(ArrayList<StringBuilder> listOfString, int width) {
        for (StringBuilder s:
             listOfString) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(0) != ' ') break;
                s.deleteCharAt(0);
            }
        }
    }
}
