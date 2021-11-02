package task1;

import java.util.ArrayList;

public class CenterAlign extends AligmentAlgo {
    @Override
    public void align(ArrayList<StringBuilder> listOfString, int width) {
        int countOfLeftSpaces;
        int countOfRightSpaces;
        for (StringBuilder s:
                listOfString) {
            if (!s.isEmpty()) {
                if ((width - s.length()) % 2 == 0) {
                    countOfLeftSpaces = (width - s.length()) / 2;
                    countOfRightSpaces = countOfLeftSpaces;
                }
                else {
                    countOfLeftSpaces = (width - s.length()) / 2;
                    if (countOfLeftSpaces != 0) countOfRightSpaces = countOfLeftSpaces + 1;
                    else countOfRightSpaces = 0;
                }
                for (int i = 0; i < countOfLeftSpaces; i++) s.insert(0, " ");
                for (int i = 0; i < countOfRightSpaces; i++) s.insert(s.length(), " ");
            }
        }
    }
}
