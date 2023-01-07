package week03;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the cols: ");
        int cols = in.nextInt();
        int[][] mat1 = createRandomMatrix(rows, cols);
        print(mat1);
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[][]{{0, 1}, {2, 3}, {3, 5}};
        int[][] c = new int[][]{{9, 8, 7}, {8, 0, 6}};
        haveSameDimension(a, b);
        System.out.println();
        print(add(a, c));
        System.out.println();
        print(subtract(a, c));

        System.out.println();
        print(multiply(a, b));
    }

    public static void createRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 100);
            }
        }
        print(matrix);
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = (int) (Math.random() * 100);
            }
        }
        return mat;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length == matrix2[i].length) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("ERROR: Two matrices should have the same dimension for addition");
            return null;
        } else {
            int[][] res = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return res;
        }

    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("ERROR: Two matrices should have the same dimension for addition");
            return null;
        } else {
            double[][] res = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return res;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("ERROR: Two matrices should have the same dimension for subtraction");
            return null;
        } else {
            int[][] res = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return res;
        }
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("ERROR: Two matrices should have the same dimension for subtraction");
            return null;
        } else {
            double[][] res = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return res;
        }
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Two matrices can't multiply");
            return null;
        } else {
            int[][] res = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        res[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return res;
        }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Two matrices can't multiply");
            return null;
        } else {
            double[][] res = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        res[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return res;
        }
    }
}
