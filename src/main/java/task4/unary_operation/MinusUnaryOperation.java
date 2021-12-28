package task4.unary_operation;

import task4.unary_operation.UnaryOperation;

public class MinusUnaryOperation extends UnaryOperation {
    @Override
    protected double doOperation(double a) {
        return -a;
    }
}
