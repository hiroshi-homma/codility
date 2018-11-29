package hiro_JVM.codility_solution.Lesson6.Sorting;

// note: need to import (so, we can use "Arrays.sort(int[])")
import java.util.*;

// System.out.println("this is a debug message");

public class Triangle {
    public static int solution_lesson6_2(int[] A) {
        Arrays.sort(A);
        for(int i=2; i< A.length; i++){
            if((long)A[i-2] + (long)A[i-1] > (long)A[i]) // note: using "long" for overflow cases
                return 1;
        }
        return 0;
    }
}
