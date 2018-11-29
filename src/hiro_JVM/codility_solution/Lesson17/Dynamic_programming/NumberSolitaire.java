package hiro_JVM.codility_solution.Lesson17.Dynamic_programming;

public class NumberSolitaire {
    public static int solution_lesson17_1(int[] A) {
        int[] dp = new int[A.length];
        dp[0] = A[0];
        for(int i=1; i<A.length; i++){
            int max = Integer.MIN_VALUE;
            for(int die=1; die<=6; die++){
                if( i-die >= 0){
                    max = Math.max( dp[i-die]+A[i], max );
                }
            }
            dp[i] = max;
        }
        
        return dp[A.length-1];
    }
}
