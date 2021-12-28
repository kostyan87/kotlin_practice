package task4;

import java.util.AbstractMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][] {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}});
        Matrix matrix2 = new Matrix(new double[][] {{10, -2, 8},
                {42, -5, 66},
                {-7, 8, 54}});
        System.out.println(matrix1.plus(matrix2));
    }
}
