package task3;

public class Square implements Shape {
    private double side;

    public Square(double side)
            throws NegativeLengthException {
        setSide(side);
    }

    public void setSide(double side)
            throws NegativeLengthException {
        if (side >= 0) this.side = side;
        else throw new NegativeLengthException("Side is negative");
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }
}
