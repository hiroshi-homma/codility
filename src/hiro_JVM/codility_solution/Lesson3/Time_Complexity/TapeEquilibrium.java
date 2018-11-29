package hiro_JVM.codility_solution.Lesson3.Time_Complexity;

//import java.util.*;

public class TapeEquilibrium {
    public static int solution_lesson3_3(int[] A) {
        int sum =0;
        int sum_part_one =0;
        int sum_part_two;
        int diff;
        int min_diff = Integer.MAX_VALUE;

        for (int aA : A) sum = sum + aA;
        for(int p =1; p< A.length; p++){
            sum_part_one = sum_part_one + A[p-1];
            sum_part_two = sum - sum_part_one;
            diff = sum_part_one - sum_part_two;
            if(diff <0)  diff = -diff;
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }
}
