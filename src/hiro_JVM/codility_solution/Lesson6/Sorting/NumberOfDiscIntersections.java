package hiro_JVM.codility_solution.Lesson6.Sorting;

// note: need to import (to use "Arrays.sort(int[])" )
import java.util.*;

// System.out.println("this is a debug message");

public class NumberOfDiscIntersections {
    public static int solution_lesson6_4_1(int[] A) {
        int intersection = 0;
        int j=0;
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];
        
        for(int i=0; i<A.length; i++){
            lower[i] = i - (long)A[i];
            upper[i] = i + (long)A[i];
        }

        Arrays.sort(upper);
        Arrays.sort(lower);

        for(int i=0; i<A.length; i++){
            while( j < A.length && upper[i] >= lower[j]){
                    intersection = intersection + j;
                    intersection = intersection - i;
                    j++;
            }          
        }

        if(intersection > 10_000_000) return -1;
        
        return intersection;
    }
}
