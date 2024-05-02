package by.itstep.khmurovich.exam.task2.util;

public class Convertor {
    public static String convert(int[][] rotatedMatrix) {
        StringBuilder builder = new StringBuilder();

        for (int[] array : rotatedMatrix) {
            for (int number : array) {
                builder.append(number).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
