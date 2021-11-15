package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    @BeforeEach
    void setUp() {
        double[][] matrix1 = {{1, 2, 3},
                              {4, 5, 6},
                              {7, 8, 9}};
        double[][] matrix2 = {{10, -2, 8},
                              {42, -5, 66},
                              {-7, 8, 54}};
    }

    @Test
    void plus1() {
        Matrix matrix1 = new Matrix(new double[][] {{1, 2, 3},
                                                    {4, 5, 6},
                                                    {7, 8, 9}});
        Matrix matrix2 = new Matrix(new double[][] {{10, -2, 8},
                                                    {42, -5, 66},
                                                    {-7, 8, 54}});
        assertEquals(new Matrix(new double[][]{{11, 0, 11},
                                               {46, 0, 72},
                                               {0, 16, 63}}),
                matrix1.plus(matrix2));
    }

    @Test
    void plus2() {
        Matrix matrix1 = new Matrix(new double[][] {{1, 2},
                                                    {4, 5},
                                                    {7, 8}});
        Matrix matrix2 = new Matrix(new double[][] {{-11, 3},
                                                    {58, 0},
                                                    {7, 88}});
        assertEquals(new Matrix(new double[][]{{-10, 5},
                                               {62, 5},
                                               {14, 96}}),
                matrix1.plus(matrix2));
    }

    @Test
    void plus3() {
        Matrix matrix1 = new Matrix(new double[][] {{1, 2, 5, 4},
                                                    {4, 5, 4, 2},
                                                    {7, 8, 2, 1}});
        Matrix matrix2 = new Matrix(new double[][] {{1, 2, 5, 4},
                                                    {4, 5, 4, 2},
                                                    {7, 8, 2, 1}});
        assertEquals(new Matrix(new double[][]{{2, 4, 10, 8},
                                               {8, 10, 8, 4},
                                               {14, 16, 4, 2}}),
                matrix1.plus(matrix2));
    }

    @Test
    void plus4() {
        Matrix matrix1 = new Matrix(new double[][] {{1}});
        Matrix matrix2 = new Matrix(new double[][] {{1}});
        assertEquals(new Matrix(new double[][]{{2}}),
                matrix1.plus(matrix2));
    }
}
