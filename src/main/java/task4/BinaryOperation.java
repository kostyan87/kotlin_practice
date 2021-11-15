package task4;

import java.util.AbstractMap;

public abstract class BinaryOperation {

    public Matrix doOperationAlgo(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(new double[matrix1.getRows()][matrix1.getColumns()]);
        for (AbstractMap.SimpleImmutableEntry<Integer, Integer> entry:
                matrix1) {
            int i = entry.getKey();
            int j = entry.getValue();
            double a = matrix1.get(i, j);
            double b = matrix2.get(i, j);
            resultMatrix.set(i, j, doOperation(a, b));
        }
        return resultMatrix;
    }

    protected abstract double doOperation(double a, double b);
}
