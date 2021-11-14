package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    private Matrix matrix1 = new Matrix(new double[][] {{1, 2, 3},
                                                        {4, 5, 6},
                                                        {7, 8, 9}});
    private Matrix matrix2 = new Matrix(new double[][] {{10, -2, 8},
                                                        {42, -5, 66},
                                                        {-7, 8, 54}});

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
    void sum() {
        assertEquals(new Matrix(new double[][]{{11, 0, 11},
                                               {46, 0, 72},
                                               {0, 16, 63}}),
                matrix1.plus(matrix2));
    }
}
