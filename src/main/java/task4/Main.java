package task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}};
        Matrix matrix1 = new Matrix(matrix);
        matrix[0][1] = 666;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix1);
    }
}
