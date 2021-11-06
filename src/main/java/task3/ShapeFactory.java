package task3;

import task3.*;

public interface ShapeFactory {
    Circle createCircle(double radius)
            throws NegativeLengthException;
    Square createSquare(double side)
            throws NegativeLengthException;
    Rectangle createRectangle(double side1, double side2)
            throws NegativeLengthException;
    Triangle createTriangle(double side1, double side2, double side3)
            throws NegativeLengthException,
            IncorrectSideException;

    Circle createRandomCircle() throws NegativeLengthException;
    Square createRandomSquare() throws NegativeLengthException;
    Rectangle createRandomRectangle() throws NegativeLengthException;
    Triangle createRandomTriangle() throws NegativeLengthException,
            IncorrectSideException;

    Shape createRandomShape() throws NegativeLengthException,
            IncorrectSideException;
}
