package hiro_JVM.codility_solution.Lesson8.Leader;

// you can also use imports, for example:
import java.util.*;

public class EquiLeader {
    public static int solution_lesson8_1(int[] A) {
        if( A.length ==0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int aA : A) {
            if (!map.containsKey(aA)) {
                map.put(aA, 1);
            } else {
                map.put(aA, map.get(aA) + 1);
            }
        }
        int max_Value =A[0];
        int max_Count =1;
        for(int j: map.keySet() ){
            int cur_Count = map.get(j);
            if( cur_Count > max_Count){
                max_Count = cur_Count;
                max_Value = j;
            }
        }
        int leader_Value;
        int leader_Count;
        if( max_Count > (0.5) * (A.length) ){
            leader_Value = max_Value;
            leader_Count = max_Count;
        }
        else{
            return 0;
        }
        int num_Equi_leaders = 0;
        int left_Leader_Count =0;

        for(int i=0; i<A.length; i++){
            if(A[i] == leader_Value){
                left_Leader_Count++;
            }
            if( left_Leader_Count > (0.5) * (i+1) ){
                int right_Leader_Count = leader_Count - left_Leader_Count;
                if( right_Leader_Count > (0.5) * (A.length -i -1) ){
                    num_Equi_leaders++;
                }
            } 
        }
        return num_Equi_leaders;
    }
}
