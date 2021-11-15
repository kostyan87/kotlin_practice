package task4.scalar_operation;

import task4.Matrix;

import java.util.AbstractMap;

public abstract class ScalarOperation {
    public Matrix doOperationAlgo(Matrix matrix, double scalar) {
        Matrix resultMatrix = new Matrix(new double[matrix.getRows()][matrix.getColumns()]);
        for (AbstractMap.SimpleImmutableEntry<Integer, Integer> entry:
                matrix) {
            int i = entry.getKey();
            int j = entry.getValue();
            double a = matrix.get(i, j);
            resultMatrix.set(i, j, doOperation(a, scalar));
        }
        return resultMatrix;
    }

    protected abstract double doOperation(double a, double scalar);
}
