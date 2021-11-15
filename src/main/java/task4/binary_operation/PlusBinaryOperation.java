package task4.binary_operation;

import task4.binary_operation.BinaryOperation;

public class PlusBinaryOperation extends BinaryOperation {
    @Override
    protected double doOperation(double a, double b) {
        return a + b;
    }
}
