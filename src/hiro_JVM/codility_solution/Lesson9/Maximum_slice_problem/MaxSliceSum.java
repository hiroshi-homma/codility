package hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem;

public class MaxSliceSum {
    public static int solution_lesson9_1(int[] A) {
        int maxEndingPrevious = A[0];
        int maxEndingHere;
        int maxSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]);
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
