package by.itstep.khmurovich.exam.task1.util;

import by.itstep.khmurovich.exam.task1.view.Printer;

import java.util.Scanner;

public class Initializer {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }
    public static void consoleInit(int[] ratings){
        Printer.print("Enter your own ratings: ");

        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = SCANNER.nextInt();
        }
    }
}
