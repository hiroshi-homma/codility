package hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers;

public class Flags {
    public static int solution_lesson10_4(int[] A) {
        if (A.length < 3) return 0;

        final int[] nexts = new int[A.length];
        int next = A.length;
        nexts[A.length - 1] = A.length;
        int peaks = 0;
        for (int i = A.length - 2; i >= 1; i--) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                next = i;
                peaks++;
            }
            nexts[i] = next;
        }
        nexts[0] = next;

        if (peaks == 0) return 0;

        int result = 1;
        final int start = nexts[0];
        int p = 1;
        int maxp = 1;

        while (maxp * maxp <= A.length) maxp++;

        if (maxp * maxp != A.length) maxp++;

        if (peaks < maxp) maxp = peaks;

        while (p <= maxp) {
            int setFlags = 0;
            for (int j = start; setFlags < p && j < A.length;
                 j = (j + p < nexts.length ? nexts[j + p] : A.length)) {
                setFlags++;
            }
            if (result < setFlags) {
                result = setFlags;
            }
            p++;
        }
        return result;
    }
}
