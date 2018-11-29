package hiro_JVM.codility_solution.Lesson5.Prefix_Sums;

public class CountDiv {
    public static int solution_lesson5_4(int A, int B, int K) {
        int result1 = B/K;
        int result2 = A/K;
        int num_B = (int) Math.floor(result1);
        int num_A = (int) Math.floor(result2);
        int num_div = num_B - num_A;
        int plus = 0;
        if(A % K == 0) plus = 1;
        num_div = num_div + plus;
        return num_div;
    }
}
