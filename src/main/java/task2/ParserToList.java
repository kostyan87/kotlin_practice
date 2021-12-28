package task2;

import java.util.ArrayList;
import java.util.List;

public class ParserToList {
    public List<String> parse(String s) {
        s = s.replaceAll("\\s+","");
        char[] chars = s.toCharArray();
        List<String> expression = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                StringBuilder term = new StringBuilder();
                while (Character.isDigit(chars[i])) {
                    term.append(chars[i]);
                    i++;
                    if (i >= chars.length) break;
                }
                i--;
                expression.add(term.toString());
            }
            else expression.add(String.valueOf(chars[i]));
        }
        return expression;
    }
}
