package hiro_JVM.codility_solution.Lesson3.Time_Complexity;

//import java.util.*;

public class PermMissingElem {
    public static int solution_lesson3_1(int[] A) {
        long range = A.length +1;
        long floor = 1;
        long missing_num = (range +floor) * range / 2;

        for (int aA : A) missing_num = missing_num - aA;
        return (int)missing_num;
    }
}
