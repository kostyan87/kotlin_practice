package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryImplTest {
    ShapeFactory shapeFactory = new ShapeFactoryImpl();

    @Test
    void createCircle() throws NegativeLengthException {
        assertEquals(new Circle(15.5665).calcArea(),
                shapeFactory.createCircle(15.5665).calcArea());
        assertEquals(new Circle(15.5665).calcPerimeter(),
                shapeFactory.createCircle(15.5665).calcPerimeter());
    }

    @Test
    void createSquare() throws NegativeLengthException {
        assertEquals(new Square(85.56554665).calcPerimeter(),
                shapeFactory.createSquare(85.56554665).calcPerimeter());
        assertEquals(new Square(85.56554665).calcArea(),
                shapeFactory.createSquare(85.56554665).calcArea());
    }

    @Test
    void createRectangle() throws NegativeLengthException {
        assertEquals(new Rectangle(85.56554665, 17.315).calcPerimeter(),
                shapeFactory.createRectangle(85.56554665, 17.315).calcPerimeter());
        assertEquals(new Rectangle(85.56554665, 17.315).calcArea(),
                shapeFactory.createRectangle(85.56554665, 17.315).calcArea());
    }

    @Test
    void createTriangle() throws NegativeLengthException,
            IncorrectSideException  {
        assertEquals(new Triangle(85.56554665, 17.315, 86.1651).calcPerimeter(),
                shapeFactory.createTriangle(85.56554665, 17.315, 86.1651).calcPerimeter());
        assertEquals(new Triangle(85.56554665, 17.315, 86.1651).calcArea(),
                shapeFactory.createTriangle(85.56554665, 17.315, 86.1651).calcArea());
    }
}