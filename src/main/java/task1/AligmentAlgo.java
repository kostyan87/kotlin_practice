package task1;

import java.util.ArrayList;

public abstract class AligmentAlgo {

    public final String alignText(StringBuilder text, int width, Aligment aligment) {
        ArrayList<StringBuilder> listOfString =
                new ToArrayOfStringConverter().convertToArrayOfString(text, width);
        align(listOfString, aligment);
        return new LineConcatenator().concatLines(listOfString);
    }

    public abstract void align(ArrayList<StringBuilder> listOfString, Aligment aligment);

//    public ArrayList<StringBuilder> convertToArrayOfString(StringBuilder text, int width) {
//        ArrayList<StringBuilder> list = new ArrayList<>();
//        StringBuilder line;
//        int count = -1;
//        for (int i = 0; i < text.length(); i++) {
//            count++;
//            if (text.charAt(i) == '\n' || i == text.length() - 1) {
//                line = new StringBuilder(text.substring(i - count, i + 1));
//                addSpaces(line, width);
//                list.add(line);
//                count = 0;
//            }
//            if (count == width) {
//                line = new StringBuilder(text.substring(i - count, i + 1));
//                list.add(line.append('\n'));
//                count = 0;
//            }
//        }
////        int len = text.length();
////        int start = 0;
////        int end = Math.min(len, width);
////        while (len > 0) {
////            list.add(new StringBuilder(text.substring(start, Math.min(text.length(), end))));
////            len = len - width;
////            start = end;
////            end = end + width;
////        }
//        return list;
//    }
}
