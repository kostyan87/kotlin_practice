package task4.unary_operation;

import task4.Matrix;

import java.util.AbstractMap;

public abstract class UnaryOperation {

    public Matrix doOperationAlgo(Matrix matrix) {
        Matrix resultMatrix = new Matrix(new double[matrix.getRows()][matrix.getColumns()]);
        for (AbstractMap.SimpleImmutableEntry<Integer, Integer> entry:
                matrix) {
            int i = entry.getKey();
            int j = entry.getValue();
            resultMatrix.set(i, j, doOperation(matrix.get(entry.getKey(), entry.getValue())));
        }
        return resultMatrix;
    }

    protected abstract double doOperation(double a);
}
