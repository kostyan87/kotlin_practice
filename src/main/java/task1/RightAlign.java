package task1;

import java.util.ArrayList;

public class RightAlign extends AligmentAlgo {
    @Override
    public void align(ArrayList<StringBuilder> listOfString, int width) {
        for (StringBuilder s:
                listOfString) {
            if (!s.isEmpty())
                while (s.length() != width) {
                    s.insert(0, " ");
                }
        }
    }
}
