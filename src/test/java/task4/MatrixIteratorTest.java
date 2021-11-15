package task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixIteratorTest {

    @Test
    void matrix1() {
        Matrix matrix1 = new Matrix(new double[][]{{1, 2, 3},
                                                   {4, 5, 6},
                                                   {7, 8, 9}});
        ArrayList<Double> iterList = new ArrayList<>(matrix1.getColumns() * matrix1.getRows());
        for (Double num:
                matrix1) {
            iterList.add(num);
        }
        assertEquals(List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0),
                iterList);
    }

    @Test
    void matrix2() {
        Matrix matrix2 = new Matrix(new double[][]{{1, 2},
                                                   {4, 5},
                                                   {7, 8}});
        ArrayList<Double> iterList = new ArrayList<>(matrix2.getColumns() * matrix2.getRows());
        for (Double num:
                matrix2) {
            iterList.add(num);
        }
        assertEquals(List.of(1.0, 2.0, 4.0, 5.0, 7.0, 8.0),
                iterList);
    }

    @Test
    void matrix3() {
        Matrix matrix3 = new Matrix(new double[][]{{1, 2, 5, 4},
                                                   {4, 5, 4, 2},
                                                   {7, 8, 2, 1}});
        ArrayList<Double> iterList = new ArrayList<>(matrix3.getColumns() * matrix3.getRows());
        for (Double num:
                matrix3) {
            iterList.add(num);
        }
        assertEquals(List.of(1.0, 2.0, 5.0, 4.0, 4.0, 5.0, 4.0, 2.0, 7.0, 8.0, 2.0, 1.0),
                iterList);
    }

    @Test
    void emptyMatrix() {
        Matrix matrix4 = new Matrix(new double[][]{});
        ArrayList<Double> iterList = new ArrayList<>(matrix4.getColumns() * matrix4.getRows());
        for (Double num:
                matrix4) {
            iterList.add(num);
        }
        assertEquals(List.of(),
                iterList);
    }

    @Test
    void identityMatrix() {
        Matrix matrix5 = new Matrix(new double[][]{{1}});
        ArrayList<Double> iterList = new ArrayList<>(matrix5.getColumns() * matrix5.getRows());
        for (Double num:
                matrix5) {
            iterList.add(num);
        }
        assertEquals(List.of(1.0),
                iterList);
    }
}
