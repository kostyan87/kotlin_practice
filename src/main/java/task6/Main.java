package task6;

import task3.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeComparators shapeComparators = new ShapeComparators();
        ShapeCollector<Shape> shapeCollector = new ShapeCollector<>();
        ShapeCollector<Circle> circleCollector = new ShapeCollector<>();

        shapeCollector.addAll(List.of(new Circle(14), new Rectangle(4, 5.2),
                new Square(8), new Triangle(4, 4, 3.5)));
        shapeCollector.add(new Square(5));

        circleCollector.addAll(List.of(new Circle(14), new Circle(8),
                new Circle(6), new Circle(17)));
        circleCollector.add(new Circle(8));

        System.out.println("Area:");
        shapeCollector.getAllSorted(shapeComparators.getAreaAscendingComparator())
                .forEach(shape -> System.out.print(shape.calcArea() + " "));
        System.out.println();
        shapeCollector.getAllSorted(shapeComparators.getAreaDescendingComparator())
                .forEach(shape -> System.out.print(shape.calcArea() + " "));

        System.out.println();

        System.out.println("Perimeter: ");
        shapeCollector.getAllSorted(shapeComparators.getPeriemeterAscendingComparator())
                .forEach(shape -> System.out.print(shape.calcPerimeter() + " "));
        System.out.println();
        shapeCollector.getAllSorted(shapeComparators.getPeriemeterDescendingComparator())
                .forEach(shape -> System.out.print(shape.calcPerimeter() + " "));

        System.out.println();

        System.out.println("Radius");
        circleCollector.getAllSorted(shapeComparators.getCircleRadiusAscendingComparator())
                .forEach(shape -> System.out.print(shape.getRadius() + " "));
        System.out.println();
        circleCollector.getAllSorted(shapeComparators.getCircleRadiusDescendingComparator())
                .forEach(shape -> System.out.print(shape.getRadius() + " "));
    }
}
