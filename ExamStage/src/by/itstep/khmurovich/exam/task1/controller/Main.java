package by.itstep.khmurovich.exam.task1.controller;

import by.itstep.khmurovich.exam.task1.model.GradeAnalyzer;
import by.itstep.khmurovich.exam.task1.util.ArrayCreator;
import by.itstep.khmurovich.exam.task1.util.Initializer;
import by.itstep.khmurovich.exam.task1.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter number of ratings: ");
        int numRatings = scanner.nextInt();

        int[] ratings = ArrayCreator.create(numRatings);

        Initializer.consoleInit(ratings);

        int result = GradeAnalyzer.findSpecialPeriod(ratings);
        Printer.print("Result: " + result);

    }
}

