package task1;

import java.util.ArrayList;

public class ToArrayOfStringConverter {

    public ArrayList<StringBuilder> convertToArrayOfString(StringBuilder text, int width) {
        ArrayList<StringBuilder> listOfStr = new ArrayList<>();
        ArrayList<StringBuilder> list = new ArrayList<>();
        if (text.length() < width)
            list.add(text);
        String[] d = text.toString().split("\n");

        for (String s:
             d) {
            System.out.println(/*'|' + */s/* + '|'*/);
            if (s.length() < width)
                list.add(new StringBuilder(/*'|' + */s/* + '|'*/));
            int start = 0;
            int end = width;
            while (end < s.length()) {
                list.add(new StringBuilder(/*'|' + */s.substring(start, end)/* + '|'*/));
                start = end;
                end = end + width;
                if (end >= s.length())
                    list.add(new StringBuilder(/*'|' + */s.substring(start)/* + '|'*/));
            }
        }

//        while (end < text.length()) {
//            list.add(new StringBuilder('|' + text.substring(start, end) + '|'));
//            start = end;
//            end = end + width;
//            if (end > text.length())
//                list.add(new StringBuilder('|' + text.substring(start, text.length()) + '|'));
//        }
//        for (int i = 0; i < text.length(); i++) {
//            count++;
//            if (text.charAt(i) == '\n' || i == text.length() - 1) {
//                line = new StringBuilder(text.substring(i - count, i + 1));
//                addSpaces(line, width);
//                list.add(line);
//                count = 0;
//            }
//            if ((i + 1) % width == 0) {
//                line = new StringBuilder(text.substring((i + 1) - width, i + 1));
//                list.add(line.append('\n'));
//                count = 0;
//            }
//        }
        return list;
    }

}
