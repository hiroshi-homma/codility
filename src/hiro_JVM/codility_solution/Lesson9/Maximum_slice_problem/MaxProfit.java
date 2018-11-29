package hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem;

public class MaxProfit {
    public static int solution_lesson9_2(int[] A) {
        if(A.length <= 1) return 0;
        int minPrice = A[0];
        int maxProfit =0;

        for(int i=1; i<A.length; i++){
            if(A[i] < minPrice)
                minPrice = A[i];
            else{
                int curProfit = A[i] - minPrice;
                if(curProfit > maxProfit) maxProfit = curProfit;
            }
        }

        return maxProfit;
    }
}
