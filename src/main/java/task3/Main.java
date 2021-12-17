package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NegativeLengthException,
            IncorrectTriangleSideException {
        ArrayList<Shape> listOfShape = new ArrayList<>(5);
        listOfShape.add(new Circle(45));
        listOfShape.add(new Square(18.51));
        listOfShape.add(new Triangle(14, 26, 30));
        listOfShape.add(new Rectangle(15, 95.26));
        listOfShape.add(new Circle(17));

        double sumOfPerimeters = 0;
        for (Shape shape:
             listOfShape) {
            sumOfPerimeters = sumOfPerimeters + shape.calcPerimeter();
        }

        double sumOfAreas = 0;
        for (Shape shape:
                listOfShape) {
            sumOfAreas = sumOfAreas + shape.calcArea();
        }

        double maxPerimeter = -1;
        Shape maxPerimeterShape = null;
        for (Shape shape:
                listOfShape) {
            if (shape.calcPerimeter() > maxPerimeter) {
                maxPerimeter = shape.calcPerimeter();
                maxPerimeterShape = shape;
            }
        }

        double maxArea = -1;
        Shape maxAreaShape = null;
        for (Shape shape:
                listOfShape) {
            if (shape.calcArea() > maxArea) {
                maxArea = shape.calcArea();
                maxAreaShape = shape;
            }
        }

        System.out.println("Sum of perimeters is " + sumOfPerimeters);
        System.out.println("Sum of areas is " + sumOfAreas);
        System.out.println("Max perimeter is " + maxPerimeter);
        System.out.println("Shape with max perimeter is " + maxPerimeterShape);
        System.out.println("Max area is " + maxArea);
        System.out.println("Shape with max area is " + maxAreaShape);
    }
}
