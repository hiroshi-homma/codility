package hiro_JVM.codility_solution.Lesson4.Counting_Elements;

import java.util.*;

public class MissingInteger {
    public static int solution_lesson4_4(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<>();
        for (int aA : A)  hset.add(aA);
        while (hset.contains(num)) num++;
        return num;
    }
}
