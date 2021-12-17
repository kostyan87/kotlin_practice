package task3;

import java.util.Random;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Circle createCircle(double radius) {
        return new Circle(radius);
    }

    @Override
    public Square createSquare(double side) {
        return new Square(side);
    }

    @Override
    public Rectangle createRectangle(double side1, double side2) {
        return new Rectangle(side1, side2);
    }

    @Override
    public Triangle createTriangle(double side1, double side2, double side3) {
        return new Triangle(side1, side2, side3);
    }

    @Override
    public Circle createRandomCircle() {
        return new Circle(Math.random() * 100);
    }

    @Override
    public Square createRandomSquare() {
        return new Square(Math.random() * 100);
    }

    @Override
    public Rectangle createRandomRectangle() {
        return new Rectangle(Math.random() * 100, Math.random() * 100);
    }

    @Override
    public Triangle createRandomTriangle() {
        return new Triangle(Math.random() * 100, Math.random() * 100, Math.random() * 100);
    }

    @Override
    public Shape createRandomShape() {
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
