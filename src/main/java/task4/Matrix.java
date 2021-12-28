package task4;

import org.jetbrains.annotations.NotNull;
import task4.assign_operation.MinusAssignOperation;
import task4.assign_operation.PlusAssignOperation;
import task4.assign_scalar_operation.DivideAssignScalarOperation;
import task4.assign_scalar_operation.MultiplicationAssignScalarOperation;
import task4.binary_operation.MinusBinaryOperation;
import task4.binary_operation.PlusBinaryOperation;
import task4.exception.CheckMatrixExceptions;
import task4.exception.IncorrectMatrixSizeException;
import task4.multiplication_operation.MultiplicationOperation;
import task4.scalar_operation.DivideScalarOperation;
import task4.scalar_operation.MultiplicationScalarOperation;
import task4.unary_operation.MinusUnaryOperation;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Matrix implements Iterable<AbstractMap.SimpleImmutableEntry<Integer, Integer>> {

    private double[][] matrix;
    private int columns;
    private int rows;

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Matrix(int rows, int columns) {
        this.columns = columns;
        this.rows = rows;
        matrix = new double[rows][columns];
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

    // matrix3 = matrix1 + matrix2
    public Matrix plus(Matrix matrix) {
        CheckMatrixExceptions.checkIncorrectMatrixSizeException(this, matrix);
        return new PlusBinaryOperation().doOperationAlgo(this, matrix);
    }

    // matrix3 = matrix1 - matrix2
    public Matrix minus(Matrix matrix) {
        CheckMatrixExceptions.checkIncorrectMatrixSizeException(this, matrix);
        return new MinusBinaryOperation().doOperationAlgo(this, matrix);
    }

    // matrix3 = matrix1 * matrix2
    public Matrix multiplication(Matrix matrix) {
        if (this.getColumns() != matrix.getRows())
            throw new IncorrectMatrixSizeException("The number of columns of the first matrix is not equal to the number of rows of the second matrix");
        return new Matrix(new MultiplicationOperation().multiplication(this, matrix));
    }

    // -matrix1
    public Matrix unaryMinus() {
        return new MinusUnaryOperation().doOperationAlgo(this);
    }

    // +matrix1
    public Matrix unaryPlus() {
        return this;
    }

    // matrix1 += matrix2
    public void plusAssign(Matrix matrix) {
        CheckMatrixExceptions.checkIncorrectMatrixSizeException(this, matrix);
        new PlusAssignOperation().doOperationAlgo(this, matrix);
    }

    // matrix1 -= matrix2
    public void minusAssign(Matrix matrix) {
        CheckMatrixExceptions.checkIncorrectMatrixSizeException(this, matrix);
        new MinusAssignOperation().doOperationAlgo(this, matrix);
    }

    // matrix1 *= matrix2
    public void multiplicationAssign(Matrix matrix) {
        if (this.getColumns() != matrix.getRows())
            throw new IncorrectMatrixSizeException("The number of columns of the first matrix is not equal to the number of rows of the second matrix");
        this.matrix = new MultiplicationOperation().multiplication(this, matrix);
        columns = this.matrix[0].length;
        rows = this.matrix.length;
    }

    // matrix1 *= scalar (matrix1 changed)
    public void divideAssignScalar(double scalar) {
        new DivideAssignScalarOperation().doOperationAlgo(this, scalar);
    }

    // matrix1 /= scalar (matrix1 changed)
    public void multiplicationAssignScalar(double scalar) {
        new MultiplicationAssignScalarOperation().doOperationAlgo(this, scalar);
    }

    // matrix2 = matrix1 * scalar
    public Matrix divideScalar(double scalar) {
        return new DivideScalarOperation().doOperationAlgo(this, scalar);
    }

    // matrix2 = matrix1 / scalar
    public Matrix multiplicationScalar(double scalar) {
        return new MultiplicationScalarOperation().doOperationAlgo(this, scalar);
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
        result = 31 * result + Arrays.deepHashCode(matrix);
        return result;
    }

    public void set(int i, int j, double value) {
        CheckMatrixExceptions.checkIncorrectIndexException(i, j, columns, rows);
        matrix[i][j] = value;
    }

    public double get(int i, int j) {
        CheckMatrixExceptions.checkIncorrectIndexException(i, j, columns, rows);
        return matrix[i][j];
    }
}
