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
        assertEquals("""
                           Это
                        текст,
                        ширина
                        которо
                            го
                        меньше
                             ,
                           чем
                        ширина
                        страни
                            цы
                             в
                        символ
                            ах""",
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
        assertEquals("""
                               Это
                        многостроч
                               ный
                            текст,
                                 с
                        различными
                         отступами
                                 и
                        переводами
                            строк,
                            ширина
                         каждой из
                           которых
                            меньше
                        чем ширина
                        страницы в
                          символах""",
                algo.alignText("""
                         Это многострочный текст,
                        с различными отступами и
                        переводами строк, ширина каждой из которых меньше
                        чем ширина страницы в символах""", 10));
    }
}
