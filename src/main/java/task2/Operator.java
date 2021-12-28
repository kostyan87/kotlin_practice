package task2;

public class Operator {
    public double doingBinaryOperation(double a, double b, String o) {
        return switch (o) {
            case "+" -> a + b;
            case "*" -> a * b;
            case "/" -> b / a;
            case "-" -> a - b;
            case "^" -> Math.pow(a, b);
            default -> 1;
        };
    }

    public double doingUnaryOperation(double a, String o) {
        if (o.equals("u-")) return -a;
        return a;
    }
}
