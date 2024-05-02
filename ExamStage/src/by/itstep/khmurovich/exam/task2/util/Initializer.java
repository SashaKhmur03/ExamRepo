package by.itstep.khmurovich.exam.task2.util;

import by.itstep.khmurovich.exam.task2.view.Printer;

import java.util.Scanner;

public class Initializer {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int[][] consoleInit(int n, int m) {
        int[][] matrix = new int[n][m];

        Printer.print("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = SCANNER.nextInt();
            }
        }
        return matrix;
    }
}
