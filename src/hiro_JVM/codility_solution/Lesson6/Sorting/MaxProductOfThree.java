package hiro_JVM.codility_solution.Lesson6.Sorting;

// note: need to import (for using "Arrays.sort(int[])")
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class MaxProductOfThree {
    public static int solution_lesson6_3(int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int max_1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int max_2 = A[0] * A[1] * A[A.length-1];
        return Math.max(max_1, max_2);
    }
}
