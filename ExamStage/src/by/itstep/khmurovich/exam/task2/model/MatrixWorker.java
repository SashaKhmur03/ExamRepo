package by.itstep.khmurovich.exam.task2.model;

public class MatrixWorker {
    public static int[][] rotateRight(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] rotatedMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[n - j - 1][i]; // rotate right
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotateLeft(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] rotatedMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[j][m - i - 1]; // rotate left
            }
        }
        return rotatedMatrix;
    }
}
