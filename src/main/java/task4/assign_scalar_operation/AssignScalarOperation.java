package task4.assign_scalar_operation;

import task4.Matrix;

import java.util.AbstractMap;

public abstract class AssignScalarOperation {
    public void doOperationAlgo(Matrix matrix, double scalar) {
        for (AbstractMap.SimpleImmutableEntry<Integer, Integer> entry:
                matrix) {
            int i = entry.getKey();
            int j = entry.getValue();
            double a = matrix.get(i, j);
            matrix.set(i, j, doOperation(a, scalar));
        }
    }

    protected abstract double doOperation(double a, double scalar);
}
