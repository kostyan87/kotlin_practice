package task6;

import task3.Circle;
import task3.Shape;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector<>();
        ShapeCollector circleCollector = new ShapeCollector<Circle>();

        shapeCollector.addAll(List.of(new Circle(14)));
    }
}
