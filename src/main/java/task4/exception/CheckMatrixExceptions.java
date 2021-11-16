package task4.exception;

import task4.Matrix;

public class CheckMatrixExceptions {
    public static void checkIncorrectMatrixSizeException(Matrix matrix1,
                                                         Matrix matrix2) {
        if (matrix2.getRows() != matrix1.getRows() || matrix2.getColumns() != matrix1.getColumns())
            throw new IncorrectMatrixSizeException("Incorrect size of matrix");
    }

    public static void checkIncorrectIndexException(int i, int j,
                                                    int rows, int columns) {
        if (i > rows || i < 0 || j > columns || j < 0)
            throw new IncorrectIndexException("incorrect index");
    }
}
