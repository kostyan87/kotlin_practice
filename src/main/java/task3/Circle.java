package task3;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius)
            throws NegativeLengthException {
        setRadius(radius);
    }

    public void setRadius(double radius) throws NegativeLengthException {
        if (radius >= 0) this.radius = radius;
        else throw new NegativeLengthException("Radius is negative");
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
