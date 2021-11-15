package task4.scalar_operation;

import task4.scalar_operation.ScalarOperation;

public class DivideScalarOperation extends ScalarOperation {
    @Override
    protected double doOperation(double a, double scalar) {
        return a / scalar;
    }
}
