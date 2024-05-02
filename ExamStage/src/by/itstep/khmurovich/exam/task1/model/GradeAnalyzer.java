package by.itstep.khmurovich.exam.task1.model;

public class GradeAnalyzer {
    public static int findSpecialPeriod(int[] ratings) {
        int maxCount = 0; // Maximum number of ratings 5
        int count = 0; // Current number of ratings 5
        boolean hasTwoOrThree = false; // Flag indicating the presence of ratings 2 or 3 in the current subsegment

        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == 5) {
                count++;
            } else if (ratings[i] == 2 || ratings[i] == 3) {
                hasTwoOrThree = true;
            }

            if (i >= 6) { // We check only subsegments 7 days long
                if (!hasTwoOrThree) {
                    maxCount = Math.max(maxCount, count);
                }

                if (ratings[i - 6] == 5) {
                    count--;
                } else if (ratings[i - 6] == 2 || ratings[i - 6] == 3) {
                    hasTwoOrThree = false;
                }
            }
        }

        if (maxCount > 0) {
            return maxCount;
        } else {
            return -1;
        }
    }
}
