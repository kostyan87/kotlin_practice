package task4.assign_scalar_operation;

import task4.assign_scalar_operation.AssignScalarOperation;

public class MultiplicationAssignScalarOperation extends AssignScalarOperation {
    @Override
    protected double doOperation(double a, double scalar) {
        return a * scalar;
    }
}
