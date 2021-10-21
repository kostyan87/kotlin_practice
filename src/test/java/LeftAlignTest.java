import org.junit.jupiter.api.Test;
import task1.AligmentAlgo;
import task1.LeftAlign;
import task1.ToArrayOfStringConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftAlignTest {
    private final AligmentAlgo algo = new LeftAlign();

//    @Test
//    void emptyTextTest() {
//        assertEquals(convertArrayListOfStringBuilderToArrayListOfString(new ArrayList<StringBuilder>()),
//                convertArrayListOfStringBuilderToArrayListOfString(new ToArrayOfStringConverter().convertToArrayOfString(new StringBuilder(""),7)));
//    }

    @Test
    void widthTextLessThanPageTest() {
        assertEquals("Это текст, ширина которого меньше, чем ширина страницы в символах",
                algo.alignText("Это текст, ширина которого меньше, чем ширина страницы в символах", 100));
    }

    @Test
    void widthTextMoreThanPageTest() {
        List<StringBuilder> list1 = Arrays.asList(new StringBuilder("Это текст, ширина которого б"),
                new StringBuilder("ольше, чем ширина страницы в"),
                new StringBuilder(" символах"));
        List<StringBuilder> list2 = new ToArrayOfStringConverter()
                .convertToArrayOfString(new StringBuilder("Это текст,\n" +
                        " ширина которого больше, чем ширина страницы в символахо"),28);
        assertEquals(convertArrayListOfStringBuilderToArrayListOfString(list1),
                convertArrayListOfStringBuilderToArrayListOfString(list2));
    }

    @Test
    void widthMultilineTextLessThanPageTest() {
        List<StringBuilder> list1 = Arrays.asList(new StringBuilder("Это многострочный текст,                                                                           \n"),
                new StringBuilder("   с различными отступами и                                                                        \n"),
                new StringBuilder("переводами строк, ширина каждой из которых меньше                                                  \n"),
                new StringBuilder("чем ширина страницы в символах                                                                     "));
        List<StringBuilder> list2 = new ToArrayOfStringConverter().convertToArrayOfString(new StringBuilder("Это многострочный текст,\n" +
                "   с различными отступами и     \n" +
                "переводами строк, ширина каждой из которых меньше\n" +
                "чем ширина страницы в символах                                     "),100);
        assertEquals(convertArrayListOfStringBuilderToArrayListOfString(list1),
                convertArrayListOfStringBuilderToArrayListOfString(list2));
    }

    @Test
    void widthMultilineTextMoreThanPageTest() {
        List<StringBuilder> list1 = Arrays.asList(new StringBuilder("Это многострочны\n"),
                new StringBuilder("й текст, длина к\n"),
                new StringBuilder("аждой из строк к\n"),
                new StringBuilder("оторого         \n"),
                new StringBuilder("           больш\n"),
                new StringBuilder("е,              \n"),
                new StringBuilder("                \n"),
                new StringBuilder("                \n"),
                new StringBuilder("чем             \n"),
                new StringBuilder("ширина страницы \n"),
                new StringBuilder("в символах      "));
        List<StringBuilder> list2 = new ToArrayOfStringConverter().convertToArrayOfString(new StringBuilder("Это многострочный текст, длина каждой из строк которого\n" +
                "           больше,                                         \n" +
                "чем     \n" +
                "ширина страницы в символах   "), 16);
        assertEquals(convertArrayListOfStringBuilderToArrayListOfString(list1),
                convertArrayListOfStringBuilderToArrayListOfString(list2));
    }

    private static List<String> convertArrayListOfStringBuilderToArrayListOfString(List<StringBuilder> listOfStringBuilder) {
        return listOfStringBuilder.
                        stream().
                        map(StringBuilder::toString).
                        collect(Collectors.toList());
    }
}
