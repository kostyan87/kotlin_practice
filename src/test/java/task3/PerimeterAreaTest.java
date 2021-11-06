package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PerimeterAreaTest {

    @Test
    void circlePerimeter() throws NegativeLengthException {
        assertEquals(2 * Math.PI * 15, new Circle(15).calcPerimeter());
    }

    @Test
    void squarePerimeter() throws NegativeLengthException {
        assertEquals(61.05008, new Square(15.26252).calcPerimeter());
    }

    @Test
    void rectanglePerimeter() throws NegativeLengthException {
        assertEquals(65.82978 , new Rectangle(18, 14.91489).calcPerimeter());
    }

    @Test
    void trianglePerimeter() throws NegativeLengthException, IncorrectSideException {
        assertEquals(118.126,
                new Triangle(19, 58.565, 40.561).calcPerimeter());
    }

    @Test
    void circleArea() throws NegativeLengthException {
        assertEquals(Math.PI * 15 * 15, new Circle(15).calcArea());
    }

    @Test
    void squareArea() throws NegativeLengthException {
        assertEquals(15.26252 * 15.26252, new Square(15.26252).calcArea());
    }

    @Test
    void rectangleArea() throws NegativeLengthException {
        assertEquals(18 * 14.91489 , new Rectangle(18, 14.91489).calcArea());
    }

    @Test
    void triangleArea() throws NegativeLengthException, IncorrectSideException {
        assertEquals(147.6568143480088,
                new Triangle(19, 58.565, 40.561).calcArea());
    }

    @Test
    void circleException() {
        assertThrows(NegativeLengthException.class, () -> {
            new Circle(-645.46);
        });
    }

    @Test
    void squareException() {
        assertThrows(NegativeLengthException.class, () -> {
            new Square(-645.46);
        });
    }

    @Test
    void rectangleException() {
        assertThrows(NegativeLengthException.class, () -> {
            new Rectangle(-645.46, 54);
        });
    }

    @Test
    void triangleException() {
        assertThrows(NegativeLengthException.class, () -> {
            new Triangle(645.46, 45, -87);
        });
        assertThrows(IncorrectSideException.class, () -> {
            new Triangle(645.46, 45, 7);
        });
    }
}
