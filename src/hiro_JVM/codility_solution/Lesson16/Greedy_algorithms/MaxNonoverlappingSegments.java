package hiro_JVM.codility_solution.Lesson16.Greedy_algorithms;

public class MaxNonoverlappingSegments {
    public static int solution_lesson16_1(int[] A, int[] B) {
        if(A.length==0) return 0;
        int currentLeftEnd = A[A.length-1];
        int numNonOverlap =1;
        
        for(int i=A.length-2; i >=0; i--){
            if(B[i] < currentLeftEnd){
                numNonOverlap++;
                currentLeftEnd = A[i];
            }
            if(A[i] > currentLeftEnd) currentLeftEnd = A[i];
        }
        
        return numNonOverlap;
    }
}
