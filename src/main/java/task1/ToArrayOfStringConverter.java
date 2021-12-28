package task1;

import java.util.ArrayList;

public class ToArrayOfStringConverter {

    public ArrayList<StringBuilder> convertToArrayOfString(String text, int width) {
        String[] arrayOfStrings = text.split("\n");
        ArrayList<String[]> listOfArraysOfWords = new ArrayList<>();
        for (String str:
             arrayOfStrings) {
            listOfArraysOfWords.add(str.split(" "));
        }
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder str = new StringBuilder(width);

        for (String[] arrayOfWords:
             listOfArraysOfWords) {
            for (int i = 0; i < arrayOfWords.length; i++) {
                String word = arrayOfWords[i];
                if (str.length() + arrayOfWords[i].length() + 1 <= width) {
                    if (str.length() == 0) {
                        str.append(word);
                    }
                    else {
                        str.append(" ").append(word);
                    }
                    if (i == arrayOfWords.length - 1) {
                        list.add(str);
                        str = new StringBuilder(word);
                    }
                }
                else {
                    if (!str.isEmpty()) list.add(str);
                    str = new StringBuilder(word);
                    if (word.length() > width) {
                        StringBuilder str1 = new StringBuilder(word.substring(0, width));
                        StringBuilder str2 = new StringBuilder(word.substring(width));
                        list.add(str1);
                        list.add(str2);
                        str = new StringBuilder();
                    }
                    else if (i == arrayOfWords.length - 1) list.add(str);
                }
            }
            str = new StringBuilder();
        }

        return list;
    }

}
