package hiro_JVM.codility_solution.Lesson99.Future_training;

public class ArrayInversionCount {
    private static final int LIMIT = 1000000000;
    public static int solution_lesson99_3(int[] A) {
        long inversionNum = countInversion(A, 0, A.length - 1);
        return inversionNum > LIMIT ? -1 : (int) inversionNum;
    }

    private static long countInversion(int[] A, int begin, int end) {
        if (begin >= end) {
            return 0;
        }

        int middle = (begin + end) / 2;
        long inversionNum = countInversion(A, begin, middle)
                + countInversion(A, middle + 1, end);
        int[] merged = new int[end - begin + 1];
        int index1 = begin;
        int index2 = middle + 1;
        for (int i = 0; i < merged.length; i++) {
            if (index2 == end + 1
                    || (index1 != middle + 1 && A[index1] <= A[index2])) {
                merged[i] = A[index1];
                index1++;
            } else {
                merged[i] = A[index2];
                index2++;
                inversionNum += middle + 1 - index1;
            }
        }
        if (end + 1 - begin >= 0) System.arraycopy(merged, 0, A, begin, end + 1 - begin);
        return inversionNum;
    }
}
