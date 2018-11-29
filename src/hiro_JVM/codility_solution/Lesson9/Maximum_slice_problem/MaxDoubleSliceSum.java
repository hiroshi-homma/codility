package hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem;

public class MaxDoubleSliceSum {
    public static int solution_lesson9_3(int[] A) {

        int maxLeft[] = new int[A.length];
        int maxRight[] = new int[A.length];

        for(int i=1; i< A.length ;i++){
            maxLeft[i] = Math.max(0, maxLeft[i-1]+A[i] );
        }

        for(int i=A.length-2; i >=0; i--){
            maxRight[i] = Math.max(0, maxRight[i+1]+A[i] );
        }

        int maxDoubleSlice =0;
        for(int i=1; i < A.length-1; i++){
            if(maxLeft[i-1] + maxRight[i+1] > maxDoubleSlice)
                maxDoubleSlice = maxLeft[i-1] + maxRight[i+1];
        } 
        
        return maxDoubleSlice;
    }
}
