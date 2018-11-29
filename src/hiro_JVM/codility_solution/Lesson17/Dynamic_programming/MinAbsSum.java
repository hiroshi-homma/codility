package hiro_JVM.codility_solution.Lesson17.Dynamic_programming;

public class MinAbsSum {
    public static int solution_lesson17_2(int[] A) {
        int i, j, n = A.length, sum = 0, mid, max = -1, maxReached = 0, val;
        int[] count = new int[101], currentReaches;
        boolean[] reaches;

        for (i = 0; i < n; i++) {
            A[i] = Math.abs(A[i]);
            count[A[i]]++;
            max = Math.max(max, A[i]);
            sum += A[i];
        }

        mid = sum / 2;
        reaches = new boolean[mid + 1];
        reaches[0] = true;
        for (i = 1; i <= max; i++) {
            if ((val = count[i]) == 0) continue;

            currentReaches = new int[mid + 1];

            for (j = 0; j <= mid - i; j++)
                if (reaches[j])
                    currentReaches[j + i] = val;
                else if (currentReaches[j] > 1)
                    currentReaches[j + i] = Math.max(currentReaches[j + i], currentReaches[j] - 1);

            for (j = 1; j <= mid; j++)
                if (currentReaches[j] > 0) {
                    reaches[j] = true;
                    maxReached = Math.max(maxReached, j);
                }
        }

        return sum - 2 * maxReached;
    }
}
