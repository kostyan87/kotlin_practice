package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryImplTest {
    ShapeFactory shapeFactory = new ShapeFactoryImpl();

    @Test
    void createCircle() {
        assertEquals(new Circle(15.5665),
                shapeFactory.createCircle(15.5665));
        assertEquals(new Circle(15.5665),
                shapeFactory.createCircle(15.5665));
    }

    @Test
    void createSquare() {
        assertEquals(new Square(85.56554665),
                shapeFactory.createSquare(85.56554665));
        assertEquals(new Square(85.56554665),
                shapeFactory.createSquare(85.56554665));
    }

    @Test
    void createRectangle() {
        assertEquals(new Rectangle(85.56554665, 17.315),
                shapeFactory.createRectangle(85.56554665, 17.315));
        assertEquals(new Rectangle(85.56554665, 17.315),
                shapeFactory.createRectangle(85.56554665, 17.315));
    }

    @Test
    void createTriangle() {
        assertEquals(new Triangle(85.56554665, 17.315, 86.1651),
                shapeFactory.createTriangle(85.56554665, 17.315, 86.1651));
        assertEquals(new Triangle(85.56554665, 17.315, 86.1651),
                shapeFactory.createTriangle(85.56554665, 17.315, 86.1651));
    }
}