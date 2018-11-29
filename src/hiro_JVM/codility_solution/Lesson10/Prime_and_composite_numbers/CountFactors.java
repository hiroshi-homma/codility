package hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers;

public class CountFactors {
    public static int solution_lesson10_1(int N) {
        int sqrtN = (int) Math.sqrt(N); 
        int numFactor =0;
        for(int i=1; i <= sqrtN; i++){
            if(N % i ==0){   
                numFactor++;
            }
        }
        numFactor = numFactor * 2;
        if( sqrtN * sqrtN == N) numFactor = numFactor -1;
        return numFactor;
    }
}
