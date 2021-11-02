package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftAlignTest {
    private final AligmentAlgo algo = new LeftAlign();

    @Test
    void emptyTextTest() {
        assertEquals("", algo.alignText("",7));
    }

    @Test
    void widthTextLessThanPageTest() {
        assertEquals("Это текст, ширина которого меньше, чем ширина страницы в символах",
                algo.alignText("Это текст, ширина которого меньше, чем ширина страницы в символах", 70));
    }

    @Test
    void widthTextWithLeftSpacesLessThanPageTest() {
        assertEquals("Это текст, ширина которого меньше, чем ширина страницы в символах",
                algo.alignText("   Это текст, ширина которого меньше, чем ширина страницы в символах", 70));
    }

    @Test
    void widthTextMoreThanPageTest() {
        assertEquals("Это\nтекст,\nширина\nкоторо\nго\nменьше\n,\nчем\nширина\nстрани\nцы\nв\nсимвол\nах",
                algo.alignText("   Это текст, ширина которого меньше, чем ширина страницы в символах", 6));
    }

    @Test
    void widthMultilineTextLessThanPageTest() {
        assertEquals("Это текст,\nширина которого больше,\nчем ширина страницы в символах",
                algo.alignText("Это текст,\n ширина которого больше,\n чем ширина страницы в символах", 100));
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
