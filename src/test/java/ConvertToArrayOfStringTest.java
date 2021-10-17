import org.junit.jupiter.api.Test;
import task1.AligmentAlgo;
import task1.LeftAlign;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToArrayOfStringTest {
    private final AligmentAlgo algo = new LeftAlign();

    @Test
    void emptyTextTest() {
        assertEquals(new ArrayList<StringBuilder>(),
                algo.convertToArrayOfString(new StringBuilder(""),7));
    }

    @Test
    void widthTextLessThanPageTest() {
        assertEquals(Arrays.asList(new StringBuilder("Это текст, ширина которого меньше, чем ширина страницы в символах                                  ")),
                algo.convertToArrayOfString(new StringBuilder("Это текст, ширина которого меньше, чем ширина страницы в символах"),100));
    }

    @Test
    void widthTextMoreThanPageTest() {
        assertEquals(Arrays.asList(new StringBuilder("Это текст, ширина которого \n"),
                                   new StringBuilder("больше, чем ширина страницы\n"),
                                   new StringBuilder(" в символах                ")),
                algo.convertToArrayOfString(new StringBuilder("Это текст, ширина которого больше, чем ширина страницы в символах"),28));
    }

    @Test
    void widthMultilineTextLessThanPageTest() {
        assertEquals(Arrays.asList(new StringBuilder("Это многострочный текст,                                                                           \n"),
                                   new StringBuilder("   с различными отступами и                                                                        \n"),
                                   new StringBuilder("переводами строк, ширина каждой из которых меньше                                                  \n"),
                                   new StringBuilder("чем ширина страницы в символах                                                                     ")),
                algo.convertToArrayOfString(new StringBuilder("Это многострочный текст,\n" +
                                                              "   с различными отступами и     \n" +
                                                              "переводами строк, ширина каждой из которых меньше\n" +
                                                              "чем ширина страницы в символах                                     "),100));
    }

    @Test
    void widthMultilineTextMoreThanPageTest() {
        assertEquals(Arrays.asList(new StringBuilder("Это многострочны\n"),
                                   new StringBuilder("й текст, длина к\n"),
                                   new StringBuilder("аждой из строк к\n"),
                                   new StringBuilder("оторого         \n"),
                                   new StringBuilder("           больш\n"),
                                   new StringBuilder("е,              \n"),
                                   new StringBuilder("                \n"),
                                   new StringBuilder("                \n"),
                                   new StringBuilder("чем             \n"),
                                   new StringBuilder("ширина страницы \n"),
                                   new StringBuilder("в символах      ")),
        algo.convertToArrayOfString(new StringBuilder("Это многострочный текст, длина каждой из строк которого\n" +
                                                      "           больше,                                         \n" +
                                                      "чем     \n" +
                                                      "ширина страницы в символах   "),100));
    }
}
