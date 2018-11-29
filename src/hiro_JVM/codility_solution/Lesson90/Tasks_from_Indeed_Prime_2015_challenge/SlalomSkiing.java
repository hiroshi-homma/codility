package hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge;

import java.util.*;

public class SlalomSkiing {
    public static int solution_lesson90_3(int[] A) {
        int i, n = A.length, val;
        long max = 0;
        long[] b = new long[3 * n];

        for (i = 0; i < n; i++)
            max = Math.max(max, A[i]);

        max++;

        for (i = 0; i < n; i++) {
            val = A[i];
            b[3 * i] = 2 * max + val;
            b[3 * i + 1] = 2 * max - val;
            b[3 * i + 2] = val;
        }

        return findMaxIncreasingSequence(b);
    }

    private static int findMaxIncreasingSequence(long[] a) {
        int i, n = a.length, index;
        long val;
        List<Long> maxIncreasing = new ArrayList<>(n);

        for (i = 0; i < n; i++) {
            val = a[i];
            index = Collections.binarySearch(maxIncreasing, val);
            if(index < 0) index = ~index;

            if (index == maxIncreasing.size())
                maxIncreasing.add(val);
            else
                maxIncreasing.set(index, val);
        }

        return maxIncreasing.size();
    }
}
