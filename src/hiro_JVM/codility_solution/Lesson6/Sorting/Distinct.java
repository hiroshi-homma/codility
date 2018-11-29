package hiro_JVM.codility_solution.Lesson6.Sorting;

// note: remember to import (for using "Arrays.sort(xxx[])")
import java.util.*;

// System.out.println("this is a debug message");

public class Distinct {
    public static int solution_lesson6_1(int[] A) {
        if(A.length ==0) return 0;
        int result =1;
        Arrays.sort(A);

        for(int i=1; i < A.length; i++){
            if(A[i] != A[i-1]){
                result++; 
            }
        }
        
        return result;
    }
}
