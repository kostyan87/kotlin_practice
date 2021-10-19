package task1;

import java.util.ArrayList;

public class ToArrayOfStringConverter {

    public ArrayList<StringBuilder> convertToArrayOfString(StringBuilder text, int width) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder line;
        int count = -1;
        for (int i = 0; i < text.length(); i++) {
            count++;
            if (text.charAt(i) == '\n' || i == text.length() - 1) {
                line = new StringBuilder(text.substring(i - count, i + 1));
                addSpaces(line, width);
                list.add(line);
                count = 0;
            }
            if (count == width) {
                line = new StringBuilder(text.substring(i - count, i + 1));
                list.add(line.append('\n'));
                count = 0;
            }
        }
        return list;
    }

    private static void addSpaces(StringBuilder line, int width) {
        line.append(" ".repeat(Math.max(0, width - line.length())));
    }
}
