package task3;

import java.util.Objects;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public void setSide(double side) {
        if (side >= 0) this.side = side;
        else throw new NegativeLengthException("Side is negative");
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
