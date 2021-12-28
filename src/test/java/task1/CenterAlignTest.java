package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CenterAlignTest {
    private final AligmentAlgo algo = new CenterAlign();

    @Test
    void emptyTextTest() {
        assertEquals("", algo.alignText("",7));
    }

    @Test
    void incorrectWidthTest() {
        assertThrows(IncorrectWidthException.class,
                () -> algo.alignText(
                        "Это текст, ширина которого меньше," +
                                " чем ширина страницы в символах", -70));
    }

    @Test
    void widthTextLessThanPageTest() {
        assertEquals("  Это текст, ширина которого меньше, чем ширина страницы в символах   ",
                algo.alignText("Это текст, ширина которого меньше, чем ширина страницы в символах", 70));
    }

    @Test
    void widthTextWithLeftSpacesLessThanPageTest() {
        assertEquals("  Это текст, ширина которого меньше, чем ширина страницы в символах   ",
                algo.alignText("   Это текст, ширина которого меньше, чем ширина страницы в символах ", 70));
    }

    @Test
    void widthTextWithLeftSpacesEqualsThanPageTest() {
        assertEquals("Это текст, ширина которого меньше, чем ширина страницы в символах",
                algo.alignText("Это текст, ширина которого меньше, чем ширина страницы в символах", 65));
    }

    @Test
    void widthTextMoreThanPageTest() {
        assertEquals("""
                         Это \s
                        текст,
                        ширина
                        которо
                          го \s
                        меньше
                          ,  \s
                         чем \s
                        ширина
                        страни
                          цы \s
                          в  \s
                        символ
                          ах \s""",
                algo.alignText("   Это текст, ширина которого меньше, чем ширина страницы в символах", 6));
    }

    @Test
    void widthMultilineTextLessThanPageTest() {
        assertEquals("       Это текст,        \n" +
                        " ширина которого больше, \n" +
                        "  чем ширина страницы в  \n" +
                        "        символах         ",
                algo.alignText("Это текст,\n ширина которого больше,\n чем ширина страницы в символах", 25));
    }

    @Test
    void widthMultilineTextMoreThanPageTest() {
        assertEquals("""
                           Это   \s
                        многостроч
                           ный   \s
                          текст, \s
                            с    \s
                        различными
                        отступами
                            и    \s
                        переводами
                          строк, \s
                          ширина \s
                        каждой из
                         которых \s
                          меньше \s
                        чем ширина
                        страницы в
                         символах\s""",
                algo.alignText("""
                         Это многострочный текст,
                        с различными отступами и
                        переводами строк, ширина каждой из которых меньше
                        чем ширина страницы в символах""", 10));
    }
}
