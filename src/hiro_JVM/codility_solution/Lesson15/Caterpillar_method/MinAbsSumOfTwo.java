package hiro_JVM.codility_solution.Lesson15.Caterpillar_method;

import java.util.*;

public class MinAbsSumOfTwo {
    public static int solution_lesson15_4(int[] A) {
        Arrays.sort(A);
        int j = A.length - 1, result = Integer.MAX_VALUE;
        for (final int value : A) {
            int best = Math.abs(value + A[j]);
            while (j > 0 && Math.abs(value + A[j - 1]) <= best) {
                j--;
                best = Math.abs(value + A[j]);
            }
            if (result > best) result = best;
        }
        return result;
    }
}