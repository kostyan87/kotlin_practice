package task4.multiplication_operation;

import task4.Matrix;

public class MultiplicationOperation {

    public double[][] multiplication(Matrix matrix1, Matrix matrix2) {
        double[][] matrix = new double[matrix1.getRows()][matrix2.getColumns()];
        for (int i = 0; i < matrix1.getRows(); i++) {
            for (int j = 0; j < matrix2.getColumns(); j++) {
                for (int k = 0; k < matrix1.getColumns(); k++) {
                    matrix[i][j] += matrix1.get(i,k) * matrix2.get(k, j);
                }
            }
        }
        return matrix;
    }
}
