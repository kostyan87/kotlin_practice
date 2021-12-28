package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    private Matrix matrix1;
    private Matrix matrix2;
    private Matrix matrix3;
    private Matrix matrix4;
    private Matrix matrix5;
    private Matrix matrix6;
    private Matrix matrix7;
    private Matrix matrix8;

    @BeforeEach
    void setUp() {
        matrix1 = new Matrix(new double[][] {{1, 2, 3},
                                             {4, 5, 6},
                                             {7, 8, 9}});
        matrix2 = new Matrix(new double[][] {{10, -2, 8},
                                             {42, -5, 66},
                                             {-7, 8, 54}});
        matrix3 = new Matrix(new double[][] {{1, 2},
                                             {4, 5},
                                             {7, 8}});
        matrix4 = new Matrix(new double[][] {{-11, 3},
                                             {58, 0},
                                             {7, 88}});
        matrix5 = new Matrix(new double[][] {{1, 2, 5, 4},
                                             {4, 5, 4, 2},
                                             {7, 8, 2, 1}});
        matrix6 = new Matrix(new double[][] {{1, 2, 5, 4},
                                             {4, 5, 4, 2},
                                             {7, 8, 2, 1}});
        matrix7 = new Matrix(new double[][] {{1}});
        matrix8 = new Matrix(new double[][] {{1}});
    }

    @Test
    void plus1() {
        assertEquals(new Matrix(new double[][]{{11, 0, 11},
                                               {46, 0, 72},
                                               {0, 16, 63}}),
                matrix1.plus(matrix2));
    }

    @Test
    void plus2() {
        assertEquals(new Matrix(new double[][]{{-10, 5},
                                               {62, 5},
                                               {14, 96}}),
                matrix3.plus(matrix4));
    }

    @Test
    void plus3() {
        assertEquals(new Matrix(new double[][]{{2, 4, 10, 8},
                                               {8, 10, 8, 4},
                                               {14, 16, 4, 2}}),
                matrix5.plus(matrix6));
    }

    @Test
    void plus4() {

        assertEquals(new Matrix(new double[][]{{2}}),
                matrix7.plus(matrix8));
    }

    @Test
    void minus() {
        assertEquals(new Matrix(new double[][]{{-9.0, 4.0, -5.0},
                                               {-38.0, 10.0, -60.0},
                                               {14.0, 0.0, -45.0}}),
                matrix1.minus(matrix2));
    }

    @Test
    void unaryMinus() {
        assertEquals(new Matrix(new double[][]{{-1, -2, -3},
                                               {-4, -5, -6},
                                               {-7, -8, -9}}),
                matrix1.unaryMinus());
    }

    @Test
    void unaryPlus() {
        assertEquals(new Matrix(new double[][]{{1, 2, 3},
                                               {4, 5, 6},
                                               {7, 8, 9}}),
                matrix1.unaryPlus());
    }

    @Test
    void assignPlus() {
        matrix1.plusAssign(matrix2);
        assertEquals(new Matrix(new double[][]{{11, 0, 11},
                                               {46, 0, 72},
                                               {0, 16, 63}}),
                matrix1);
    }

    @Test
    void assignMinus() {
        matrix1.minusAssign(matrix2);
        assertEquals(new Matrix(new double[][]{{-9.0, 4.0, -5.0},
                                               {-38.0, 10.0, -60.0},
                                               {14.0, 0.0, -45.0}}),
                matrix1);
    }

    @Test
    void divideAssignScalar() {
        matrix1.divideAssignScalar(2);
        assertEquals(new Matrix(new double[][]{{0.5, 1.0, 1.5},
                                               {2, 2.5, 3},
                                               {3.5, 4, 4.5}}),
                matrix1);
    }

    @Test
    void multiplicationAssignScalar() {
        matrix1.multiplicationAssignScalar(2);
        assertEquals(new Matrix(new double[][]{{2, 4, 6},
                                               {8, 10, 12},
                                               {14, 16, 18}}),
                matrix1);
    }

    @Test
    void divideScalar() {
        assertEquals(new Matrix(new double[][]{{0.5, 1, 1.5},
                                               {2, 2.5, 3},
                                               {3.5, 4, 4.5}}),
                matrix1.divideScalar(2));
    }

    @Test
    void multiplicationScalar() {
        assertEquals(new Matrix(new double[][]{{2, 4, 6},
                                               {8, 10, 12},
                                               {14, 16, 18}}),
                matrix1.multiplicationScalar(2));
    }

    @Test
    void multiplication1() {
        assertEquals(new Matrix(new double[][]{{73, 12, 302},
                                               {208, 15, 686},
                                               {343, 18, 1070}}),
                matrix1.multiplication(matrix2));
    }

    @Test
    void multiplication2() {
        assertEquals(new Matrix(new double[][]{{30, 36},
                                               {66, 81},
                                               {102, 126}}),
                matrix1.multiplication(matrix3));
    }

    @Test
    void multiplicationAssign() {
        matrix1.multiplicationAssign(matrix3);
        assertEquals(new Matrix(new double[][]{{30, 36},
                                               {66, 81},
                                               {102, 126}}),
                matrix1);
    }
}
