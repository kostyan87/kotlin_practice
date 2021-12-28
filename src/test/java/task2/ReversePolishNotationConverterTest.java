package task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationConverterTest {

    ReversePolishNotationConverter converter = new ReversePolishNotationConverter();

    @Test
    void convertFromInfixNotation1() {
        assertEquals(List.of("5", "8", "*", "2", "9", "+", "*", "7", "5", "-",
                "8", "+", "9", "5", "5", "*", "*", "-", "5", "+", "+"), converter.convertFromInfixNotation(
                        List.of("5", "*", "8", "*", "(", "2", "+", "9", ")", "+",
                        "(", "7", "-", "5", "+", "8", "-", "9", "*", "(", "5", "*",
                        "5", ")", "+", "5", ")")));
    }

    @Test
    void convertFromInfixNotation2() {
        assertEquals(List.of("5", "4", "+", "3", "-"), converter.convertFromInfixNotation(
                List.of("5", "+", "4", "-", "3")));
    }

    @Test
    void convertFromInfixNotation3() {
        assertEquals(List.of("3", "u-", "4", "^", "+", "4", "+"), converter.convertFromInfixNotation(
                List.of("-", "3", "+", "4", "^", "+", "4")));
    }

    @Test
    void convertFromInfixNotation4() {
        assertEquals(List.of("12", "3", "+"), converter.convertFromInfixNotation(
                List.of("12", "+", "3")));
    }

    @Test
    void convertFromInfixNotation6() {
        assertEquals(List.of("4", "u-", "3", "+", "8", "*", "4", "/"), converter.convertFromInfixNotation(
                List.of("(", "(", "-", "4", "+", "3", ")", ")", "*", "8", "/", "4")));
    }
}