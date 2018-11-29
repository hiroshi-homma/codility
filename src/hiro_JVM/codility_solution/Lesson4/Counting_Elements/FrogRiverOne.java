package hiro_JVM.codility_solution.Lesson4.Counting_Elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution_lesson4_2(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<= X; i++) set.add(i);
        for(int i=0; i< A.length; i++){
            set.remove(A[i]);
            if(set.isEmpty()) return i;
        }
        return -1;
    }
}
