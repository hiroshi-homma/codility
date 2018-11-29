package hiro_JVM.codility_solution.Lesson15.Caterpillar_method;

import java.util.*;

public class AbsDistinct {
    public static int solution_lesson15_1(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int aA : A)  set.add(Math.abs(aA));
        return set.size();
     }
}
