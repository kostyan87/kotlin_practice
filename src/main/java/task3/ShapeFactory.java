package task3;

public interface ShapeFactory {
    Circle createCircle(double radius);
    Square createSquare(double side);
    Rectangle createRectangle(double side1, double side2);
    Triangle createTriangle(double side1, double side2, double side3);

    Circle createRandomCircle();
    Square createRandomSquare();
    Rectangle createRandomRectangle();
    Triangle createRandomTriangle();

    Shape createRandomShape();
}
