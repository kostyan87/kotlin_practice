package task4.assign_operation;

import task4.assign_operation.AssignOperation;

public class MinusAssignOperation extends AssignOperation {
    @Override
    protected double doOperation(double a, double b) {
        return a - b;
    }
}
