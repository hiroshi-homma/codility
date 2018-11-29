package hiro_JVM.codility_solution.Lesson4.Counting_Elements;

import java.util.*;

public class PermCheck {
    public static int solution_lesson4_1(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int aA : A) set.add(aA);
        for(int i=1; i<= A.length; i++) if(!set.contains(i)) return 0;

        return 1;
    }
}
