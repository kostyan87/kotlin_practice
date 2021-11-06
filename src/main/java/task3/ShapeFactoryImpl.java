package task3;

import java.util.Random;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Circle createCircle(double radius)
            throws NegativeLengthException {
        return new Circle(radius);
    }

    @Override
    public Square createSquare(double side)
            throws NegativeLengthException {
        return new Square(side);
    }

    @Override
    public Rectangle createRectangle(double side1, double side2)
            throws NegativeLengthException {
        return new Rectangle(side1, side2);
    }

    @Override
    public Triangle createTriangle(double side1, double side2, double side3)
            throws NegativeLengthException,
            IncorrectSideException  {
        return new Triangle(side1, side2, side3);
    }

    @Override
    public Circle createRandomCircle() throws NegativeLengthException {
        return new Circle(Math.random() * 100);
    }

    @Override
    public Square createRandomSquare() throws NegativeLengthException {
        return new Square(Math.random() * 100);
    }

    @Override
    public Rectangle createRandomRectangle() throws NegativeLengthException {
        return new Rectangle(Math.random() * 100, Math.random() * 100);
    }

    @Override
    public Triangle createRandomTriangle() throws NegativeLengthException,
            IncorrectSideException {
        return new Triangle(Math.random() * 100, Math.random() * 100, Math.random() * 100);
    }

    @Override
    public Shape createRandomShape() throws NegativeLengthException,
            IncorrectSideException {
        Random random = new Random();
        int num = random.nextInt(4);
        return switch (num) {
            case 0 -> new Circle(Math.random() * 100);
            case 1 -> new Square(Math.random() * 100);
            case 2 -> new Rectangle(Math.random() * 100, Math.random() * 100);
            case 3 -> new Triangle(Math.random() * 100,
                    Math.random() * 100, Math.random() * 100);
            default -> null;
        };
    }
}
