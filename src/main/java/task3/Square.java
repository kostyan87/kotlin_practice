package task3;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public void setSide(double side) {
        try {
            if (side >= 0) this.side = side;
            else throw new NegativeLengthException("Side is negative");
        }
        catch (NegativeLengthException e) {
            System.out.println(e.getMessage());
        }
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
