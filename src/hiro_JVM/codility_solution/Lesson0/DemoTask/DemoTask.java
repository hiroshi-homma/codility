package hiro_JVM.codility_solution.Lesson0.DemoTask;

import java.util.*;

public class DemoTask {
    public static int solution_demo(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<>();
        for (int aA : A)  hset.add(aA);
        while (hset.contains(num)) num++;
        return num;
    }
}
