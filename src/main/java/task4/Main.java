package task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] mat1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        double[][] mat2 = {{1, 2},
                           {4, 5},
                           {7, 8}};
        double[][] mat3 = {{1, 2, 5, 4},
                           {4, 5, 4, 2},
                           {7, 8, 2, 1}};
        double[][] mat4 = {};
        double[][] mat5 = {{1}};
        Matrix matrix1 = new Matrix(mat1);
        Matrix matrix2 = new Matrix(mat2);
        Matrix matrix3 = new Matrix(mat3);
        Matrix matrix4 = new Matrix(mat4);
        Matrix matrix5 = new Matrix(mat5);
        for (Double num:
             matrix1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Double num:
                matrix2) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Double num:
                matrix3) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Double num:
                matrix4) {
            System.out.print(num + " ");
        }
        for (Double num:
                matrix5) {
            System.out.print(num + " ");
        }
    }
}
