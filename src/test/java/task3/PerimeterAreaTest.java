package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PerimeterAreaTest {

    @Test
    void circlePerimeter() {
        assertEquals(2 * Math.PI * 15, new Circle(15).calcPerimeter());
    }

    @Test
    void squarePerimeter() {
        assertEquals(61.05008, new Square(15.26252).calcPerimeter());
    }

    @Test
    void rectanglePerimeter() {
        assertEquals(65.82978 , new Rectangle(18, 14.91489).calcPerimeter());
    }

    @Test
    void trianglePerimeter() {
        assertEquals(118.126,
                new Triangle(19, 58.565, 40.561).calcPerimeter());
    }

    @Test
    void circleArea() {
        assertEquals(Math.PI * 15 * 15, new Circle(15).calcArea());
    }

    @Test
    void squareArea() {
        assertEquals(15.26252 * 15.26252, new Square(15.26252).calcArea());
    }

    @Test
    void rectangleArea() {
        assertEquals(18 * 14.91489 , new Rectangle(18, 14.91489).calcArea());
    }

    @Test
    void triangleArea() {
        assertEquals(147.6568143480088,
                new Triangle(19, 58.565, 40.561).calcArea());
    }

    @Test
    void circleException() {
        assertThrows(NegativeLengthException.class, () -> new Circle(-645.46));
    }

    @Test
    void squareException() {
        assertThrows(NegativeLengthException.class, () -> new Square(-645.46));
    }

    @Test
    void rectangleException() {
        assertThrows(NegativeLengthException.class, () -> new Rectangle(-645.46, 54));
    }

    @Test
    void triangleException() {
        assertThrows(NegativeLengthException.class, () -> new Triangle(645.46, 45, -87));
        assertThrows(IncorrectTriangleSideException.class, () -> new Triangle(645.46, 45, 7));
    }
}
