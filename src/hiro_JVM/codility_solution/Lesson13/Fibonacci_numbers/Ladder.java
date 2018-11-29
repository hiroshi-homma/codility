package hiro_JVM.codility_solution.Lesson13.Fibonacci_numbers;


public class Ladder {
    public static int[] solution_lesson13_2(int[] A, int[] B) {

        int L = A.length;
        int max = 0;
        int[] results = new int[L];

        for (int aA : A) max = Math.max(aA, max);
        int[] fibonacci = new int[max+1];

        fibonacci[0] =1;
        fibonacci[1] =1;

        for(int i=2; i<= max; i++) fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % (1 << 30);
        
        for(int i=0; i<L; i++) results[i] = fibonacci[A[i]] % (1 << B[i]);
        
        return results;
    }
}
