package hiro_JVM.codility_solution.Lesson15.Caterpillar_method;

public class CountDistinctSlices {
    public static int solution_lesson15_2(int M, int[] A) {
        boolean[] seen = new boolean[M+1];
        int leftEnd=0;
        int rightEnd=0;
        int numSlice =0;

        while(leftEnd < A.length && rightEnd < A.length){
            if(!seen[A[rightEnd]]){
                numSlice = numSlice + (rightEnd - leftEnd + 1);
                if(numSlice >= 1_000_000_000)
                    return 1_000_000_000;
                seen[A[rightEnd]] = true;
                rightEnd++; 
            }
            else{
                seen[A[leftEnd]] = false;
                leftEnd++;
            } 
        }
        
        return numSlice;
    }
}
