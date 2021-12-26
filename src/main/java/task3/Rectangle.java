package task3;

import java.util.Objects;

public class Rectangle implements Shape {
    private double side1;
    private double side2;

    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        setSides(side1, side2);
    }

    public void setSides(double side1, double side2) {
        if (side1 >= 0 && side2 >= 0) {
            this.side1 = side1;
            this.side2 = side2;
        } else throw new NegativeLengthException("Side is negative");
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double calcArea() {
        return side1 * side2;
    }

    @Override
    public double calcPerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.side1, side1) == 0 && Double.compare(rectangle.side2, side2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
