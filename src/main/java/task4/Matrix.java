package task4;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements Cloneable {

    private double[][] matrix;
    private int columns;
    private int rows;

    public Matrix(double[][] matrix) {
        this.columns = matrix[0].length;
        this.rows = matrix.length;
        this.matrix = new double[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, this.matrix[i], 0, matrix[i].length);
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }

    public Matrix plus(Matrix matrixForSum) {
        double[][] matrixOfSum = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixOfSum[i][j] = matrix[i][j] + matrixForSum.get(i, j);
            }
        }
        return new Matrix(matrixOfSum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (this.get(i, j) != ((Matrix) o).get(i, j))
                    return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(columns, rows);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }

    public Matrix plusAssign(Matrix matrix) {
        //TODO;
        return null;
    }

    public void times(double scalar) {
        //TODO;
    }

    public void timesAssign(double scalar) {
        //TODO;
    }

    public void set(int i, int j, double value) {
        checkIncorrectIndexException(i, j);
        matrix[i][j] = value;
    }

    public double get(int i, int j) {
        checkIncorrectIndexException(i, j);
        return matrix[i][j];
    }

    private void checkIncorrectIndexException(int i, int j) {
        if (i > matrix.length || i < 0 || j > matrix[0].length || j < 0)
            throw new IncorrectIndexException("incorrect index");
    }

    public Matrix unaryMinus() {
        //TODO;
        return null;
    }

    public Matrix unaryPlus() {
        //TODO;
        return this;
    }
}
