package task3;

import java.util.Objects;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        setSides(side1, side2, side3);
    }

    public void setSides(double side1, double side2, double side3) {
        if (side1 >= 0 && side2 >= 0 && side3 >= 0) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else throw new NegativeLengthException("Side is negative");
        if (!checkSides(side1, side2, side3))
            throw new IncorrectTriangleSideException("Sides is incorrect");
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double calcArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }

    private static boolean checkSides(double side1, double side2, double side3) {
        return (side1 + side2) > side3 && (side1 + side3) > side2
                && (side3 + side2) > side1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }
}
