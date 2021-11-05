package task3;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        try {
            if (radius >= 0) this.radius = radius;
            else throw new NegativeLengthException("Radius is negative");
        }
        catch (NegativeLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
