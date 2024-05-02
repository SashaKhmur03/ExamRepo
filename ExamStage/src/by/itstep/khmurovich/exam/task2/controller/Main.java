package by.itstep.khmurovich.exam.task2.controller;

import by.itstep.khmurovich.exam.task2.util.Convertor;
import by.itstep.khmurovich.exam.task2.view.Printer;

import java.util.Scanner;

import static by.itstep.khmurovich.exam.task2.model.MatrixWorker.rotateLeft;
import static by.itstep.khmurovich.exam.task2.model.MatrixWorker.rotateRight;
import static by.itstep.khmurovich.exam.task2.util.Initializer.consoleInit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter matrix dimension (N M): ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            Printer.print("Error");
            return;
        }


        Printer.print("Enter the direction of rotation (L - Left, R - Right): ");
        String direction = scanner.next();

        int[][] matrix = consoleInit(n, m);


        int[][] rotatedMatrix;
        if (direction.equals("R")) {
            rotatedMatrix = rotateRight(matrix);
        } else if (direction.equals("L")) {
            rotatedMatrix = rotateLeft(matrix);
        } else {
            Printer.print("Wrong direction of turn. Rotation failed.");
            return;
        }

        Printer.print("Resulting matrix:" + "\n" + Convertor.convert(rotatedMatrix));

    }
}
