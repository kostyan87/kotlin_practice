package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightAlignTest {
    private final AligmentAlgo algo = new RightAlign();

    @Test
    void emptyTextTest() {
        assertEquals("", algo.alignText("",7));
    }

    @Test
    void widthTextLessThanPageTest() {
        assertEquals("     Это текст, ширина которого меньше, чем ширина страницы в символах",
                algo.alignText("Это текст, ширина которого меньше, чем ширина страницы в символах", 70));
    }

    @Test
    void widthTextWithLeftSpacesLessThanPageTest() {
        assertEquals("     Это текст, ширина которого меньше, чем ширина страницы в символах",
                algo.alignText("Это текст, ширина которого меньше, чем ширина страницы в символах   ", 70));
    }

    @Test
    void widthTextMoreThanPageTest() {
        assertEquals("   Это\nтекст,\nширина\nкоторо\n    го\nменьше\n     ,\n   чем\nширина\n" +
                        "страни\n    цы\n     в\nсимвол\n    ах",
                algo.alignText("   Это текст, ширина которого меньше, чем ширина страницы в символах", 6));
    }

    @Test
    void widthMultilineTextLessThanPageTest() {
        assertEquals("                                        Это текст,\n" +
                        "                           ширина которого больше,\n" +
                        "                    чем ширина страницы в символах",
                algo.alignText("Это текст,\n ширина которого больше,\n чем ширина страницы в символах", 50));
    }

    @Test
    void widthMultilineTextMoreThanPageTest() {
        assertEquals("       Это\nмногостроч\n       ный\n    текст,\n         с\nразличными\n отступами\n" +
                        "         и\nпереводами\n    строк,\n    ширина\n каждой из\n   которых\n    меньше\n" +
                        "чем ширина\nстраницы в\n  символах",
                algo.alignText(" Это многострочный текст,\n" +
                        "с различными отступами и\n" +
                        "переводами строк, ширина каждой из которых меньше\n" +
                        "чем ширина страницы в символах", 10));
    }
}
