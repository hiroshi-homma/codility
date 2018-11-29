package hiro_JVM.codility_solution.Lesson5.Prefix_Sums;

public class PassingCars {
    public static int solution_lesson5_1(int[] A) {
        int num_east = 0;
        int num_pass = 0;
        for (int aA : A) {
            if (aA == 0) num_east++;
            if (aA == 1) num_pass = num_pass + num_east;
        }

        if(num_pass > 1_000_000_000 || num_pass < 0)
            return -1;
        else
            return num_pass;
    }
}
