package by.itstep.khmurovich.exam.task2.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MatrixWorkerTest {
    @Test
    public void testRotateRight() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{4, 1}, {5, 2}, {6, 3}};

        int[][] result = MatrixWorker.rotateRight(matrix);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testRotateLeft() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{3, 6}, {2, 5}, {1, 4}};

        int[][] result = MatrixWorker.rotateLeft(matrix);

        Assertions.assertArrayEquals(expected, result);
    }
}
