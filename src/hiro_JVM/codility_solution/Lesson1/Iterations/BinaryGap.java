package hiro_JVM.codility_solution.Lesson1.Iterations;

//import java.util.*;

public class BinaryGap {
    public static int solution_lesson1_1(int N) {
        int binaryGap = 0;
        boolean found_one = false;
        for (int i = 0; N > i; N /= 2) {
            if (N % 2 == 0) {
                i++;
            } else {
                if (i > binaryGap && found_one){
                    binaryGap = i;
                }
                found_one = true;
                i = 0;
            }
        }
        return binaryGap;
    }
}
