package task3;

public class Rectangle implements Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2)
            throws NegativeLengthException {
        setSides(side1, side2);
    }

    public void setSides(double side1, double side2)
            throws NegativeLengthException {
        if (side1 >= 0 && side2 >= 0) {
            this.side1 = side1;
            this.side2 = side2;
        } else throw new NegativeLengthException("Side is negative");
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
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}