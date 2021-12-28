package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void calculate1() {
        assertEquals(15, calculator.calculate("12+ 3"));
    }

    @Test
    void calculate2() {
        assertEquals(253, calculator.calculate("-3+4^4"));
    }

    @Test
    void calculate3() {
        assertEquals(-15.75, calculator.calculate("(4+3)*9/ -4"));
    }

    @Test
    void calculate4() {
        assertEquals(-2, calculator.calculate("((-4+3))*8/4"));
    }

    @Test
    void calculate5() {
        assertThrows(IncorrectExpressionException.class, () -> calculator.calculate("(-3+9))*30"));
    }

    @Test
    void calculate6() {
        assertThrows(IncorrectExpressionException.class, () -> calculator.calculate("+4 */ 33"));
    }

    @Test
    void calculate7() {
        assertThrows(IncorrectExpressionException.class, () -> calculator.calculate("*3 + 3"));
    }

    @Test
    void calculate8() {
        assertThrows(IncorrectExpressionException.class, () -> calculator.calculate("3+alksdjfklsdjfkldj+asdfd+3"));
    }
}