package hiro_JVM.codility_solution.Lesson14.Binary_search_algorithm;

public class NailingPlanks {
    public static int solution_lesson14_2(int[] A, int[] B, int[] C) {
        final int[] nails = new int[2 * C.length + 1];
        int begin = 0;
        int end = C.length;
        int result = -1;
        while(begin <= end) {
            int middle = (begin + end) / 2;
            for (int i = 0; i < nails.length; i++) {
                nails[i] = 0;
            }
            for (int i = 0; i < middle; i++) {
                nails[C[i]] = 1;
            }
            int counter = 0;
            for (int i = 0; i < nails.length; i++) {
                if (nails[i] == 1) {
                    counter++;
                }
                nails[i] = counter;
            }
            boolean found = true;
            for (int i = 0; i < A.length; i++) {
                if (nails[B[i]] - nails[A[i] - 1] == 0) {
                    found = false;
                    break;
                }
            }
            if (found) {
                end = middle - 1;
                result = middle;
            } else {
                begin = middle + 1;
            }
        }
        return result;
    }
}
