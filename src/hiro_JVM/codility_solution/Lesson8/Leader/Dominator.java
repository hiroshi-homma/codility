package hiro_JVM.codility_solution.Lesson8.Leader;

// you can also use imports, for example:
import java.util.*;

public class Dominator {
    public static int solution_lesson8_2(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int aA : A) {
            if (!map.containsKey(aA)) {
                map.put(aA, 1);
            } else {
                int count = map.get(aA);
                map.put(aA, count + 1);
            }
        }
        int max_Number =0;
        int max_Count =0;
        for( int key: map.keySet() ){
            int cur_Count = map.get(key);
            if( cur_Count > max_Count){
                max_Count = cur_Count;
                max_Number = key;
            }
        }
        if (max_Count <= (A.length) / 2) {
            return -1;
        }
        for(int i=0; i<A.length; i++){
            if(A[i] == max_Number){
                return i; // return the index
            }
        }
        return -1;
    }
}
