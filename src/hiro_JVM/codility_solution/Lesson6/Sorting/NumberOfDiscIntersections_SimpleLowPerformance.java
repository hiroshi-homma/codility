package hiro_JVM.codility_solution.Lesson6.Sorting;

// This is a simple solution with O(n^2) the performance score is low (but 100% correct)

// note: need to import (to use "Arrays.sort(int[])" )

public class NumberOfDiscIntersections_SimpleLowPerformance {
    public static int solution_lesson6_4_2(int[] A) {
        int intersection = 0;
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for(int i=0; i<A.length; i++){
            lower[i] = i - (long)A[i];
            upper[i] = i + (long)A[i];
        }

        for(int i=0; i<A.length; i++){
            for(int j = i+1; j<A.length; j++){
                if(upper[i]>=lower[j]) intersection++;
            }
        }

        if(intersection > 10_000_000) return -1;

        return intersection;
    }
}
