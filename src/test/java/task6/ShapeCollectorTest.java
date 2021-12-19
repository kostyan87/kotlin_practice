package task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task3.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCollectorTest {
    ShapeComparators shapeComparators = new ShapeComparators();
    ShapeCollector<Shape> shapeCollector = new ShapeCollector<>();
    ShapeCollector<Circle> circleCollector = new ShapeCollector<>();

    @BeforeEach
    void setUp() {
        shapeCollector.addAll(List.of(new Circle(14), new Rectangle(4, 5.2),
                new Square(8), new Triangle(4, 4, 3.5)));
        shapeCollector.add(new Square(5));

        circleCollector.addAll(List.of(new Circle(14), new Circle(8),
                new Circle(6), new Circle(17)));
        circleCollector.add(new Circle(8));
    }

    @Test
    void area() {
        assertEquals(List.of(new Circle(14), new Square(8),
                        new Square(5), new Rectangle(4, 5.2), new Triangle(4, 4, 3.5)),
                shapeCollector.getAllSorted(shapeComparators.getAreaDescendingComparator()));
        assertEquals(List.of(new Triangle(4, 4, 3.5), new Rectangle(4, 5.2),
                        new Square(5), new Square(8), new Circle(14)),
                shapeCollector.getAllSorted(shapeComparators.getAreaAscendingComparator()));
    }

    @Test
    void perimeter() {
        assertEquals(List.of(new Circle(14), new Square(8),
                        new Square(5), new Rectangle(4, 5.2), new Triangle(4, 4, 3.5)),
                shapeCollector.getAllSorted(shapeComparators.getPeriemeterDescendingComparator()));
        assertEquals(List.of(new Triangle(4, 4, 3.5), new Rectangle(4, 5.2),
                        new Square(5), new Square(8), new Circle(14)),
                shapeCollector.getAllSorted(shapeComparators.getPeriemeterAscendingComparator()));
    }

    @Test
    void radius() {
        assertEquals(List.of(new Circle(17), new Circle(14),
                        new Circle(8), new Circle(8), new Circle(6)),
                circleCollector.getAllSorted(shapeComparators.getCircleRadiusDescendingComparator()));
        assertEquals(List.of(new Circle(6), new Circle(8), new Circle(8),
                new Circle(14), new Circle(17)),
                circleCollector.getAllSorted(shapeComparators.getCircleRadiusAscendingComparator()));
    }
}