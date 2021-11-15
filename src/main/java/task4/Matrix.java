package task4;

import org.jetbrains.annotations.NotNull;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Matrix implements Iterable<AbstractMap.SimpleImmutableEntry<Integer, Integer>> {

    private double[][] matrix;
    private final int columns;
    private final int rows;

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Matrix(double[][] matrix) {
        this.rows = matrix.length;
        if (rows == 0) this.columns = 0;
        else this.columns = matrix[0].length;
        this.matrix = new double[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, this.matrix[i], 0, matrix[i].length);
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }

    // returns the indices of the next element
    @NotNull
    @Override
    public Iterator<AbstractMap.SimpleImmutableEntry<Integer, Integer>> iterator() {
        return new Iterator<>() {
            private int i = 0;
            private int j = 0;

            @Override
            public boolean hasNext() {
                return (i <= rows - 1);
            }

            @Override
            public AbstractMap.SimpleImmutableEntry<Integer, Integer> next() {
                int resultI = i;
                int resultJ = j;
                j++;
                if (j == columns) {
                    i++;
                    j = 0;
                }
                return new AbstractMap.SimpleImmutableEntry<>(resultI, resultJ);
            }
        };
    }

    public Matrix plus(Matrix matrixForSum) {
        return new PlusBinaryOperation().doOperationAlgo(this, matrixForSum);
    }

    public Matrix minus(Matrix matrixForSum) {
        return new MinusBinaryOperation().doOperationAlgo(this, matrixForSum);
    }

    public Matrix unaryMinus() {
        return new MinusUnaryOperation().doOperationAlgo(this);
    }

    public Matrix unaryPlus() {
        return this;
    }

    public Matrix multiplication(Matrix matrixForSum) {
        return null;
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
}
